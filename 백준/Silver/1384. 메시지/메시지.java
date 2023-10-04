import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		
		//무한루프
		while(true) {
			
			int n = Integer.parseInt(br.readLine());
			
			//0이 입력되면 무한루프 종료
			if(n == 0) break;
			
			String[][] arr = new String[n][n];
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					arr[i][j] = st.nextToken();
				}
			}
			
			//그룸의 번호를 출력
			System.out.println("Group " + num);
			
			//count는 "N"이 하나도 없을 경우 다른 값을 출력하기 위한 변수이다.
			int count = 0;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(arr[i][j].equals("N")) {
						//작으면 뺏을때 음수이니 이렇게 해도 되고, j - i < 0으로 조건을 만들어도 된다.
						if(i < j) {
							System.out.println(arr[n - (j - i)][0] + " was nasty about " + arr[i][0]);
						}else {
							System.out.println(arr[i - j][0] + " was nasty about " + arr[i][0]);
						}
						count = 1;
					}
				}
			}
			//그룹 번호
			num++;
			//"N"이 없으면 아래 문구를 출력
			if(count == 0) {
				System.out.println("Nobody was nasty");
			}
			System.out.println();
		}
	}

}