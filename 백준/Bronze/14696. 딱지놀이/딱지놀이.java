import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		

		round: for (int i = 0; i < N; i++) {
			
			//딱지의 갯수 저장
			int[] a = new int[101];
			int[] b = new int[101];
			
			//a의 딱지
			st = new StringTokenizer(br.readLine());
			int temp = Integer.parseInt(st.nextToken());
			for (int j = 0; j < temp; j++) {
				a[Integer.parseInt(st.nextToken())]++;
			}
			//b의 딱지
			st = new StringTokenizer(br.readLine());
			temp = Integer.parseInt(st.nextToken());
			for (int j = 0; j < temp; j++) {
				b[Integer.parseInt(st.nextToken())]++;
			}
			
			//뒤에서 부터 딱지갯수 체크
			for (int k = 100; k > 0; k--) {
				if (a[k] > b[k]) {
					sb.append("A").append("\n");
					continue round;
				} else if (a[k] < b[k]) {
					sb.append("B").append("\n");
					continue round;
				}
			}
			
			//무승부
			sb.append("D").append("\n");
		}
		
		System.out.println(sb);

	}

}