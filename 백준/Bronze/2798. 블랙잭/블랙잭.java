import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(token.nextToken()); // 카드의 개수
		int M = Integer.parseInt(token.nextToken()); // 조건
		int[] arr = new int[N];
		
		token = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		
		br.close();
		
		int answer = search(arr, N, M);
		
		System.out.println(answer);
	}

	private static int search(int[] arr, int N, int M) {
		int answer = 0;
		
		for(int i=0; i<N-2; i++) { // 3개를 고르기 때문에 첫번째 카드는 N-2 까지
			
			if(arr[i] > M) continue; // 첫 번째 카드가 M보다 크면 건너뛴다.
			
			for(int j=i+1; j<N-1; j++) { // 두번째 카드는 N-1 까지
				
				if(arr[i] + arr[j] > M) continue; // 두 카드의 합이 M보다 크면 건너뛴다.
				
				for(int k=j+1; k<N; k++) { // 세번째 카드는 N까지 
					int temp = arr[i] + arr[j] + arr[k];
					
					if(M == temp) { // M과 세 카드의 합이 같은지 확인
						return temp;
					}
					
					if(answer < temp && temp < M) { // 세 카드의 합이 이전 합보다 크면서 M보다 작을 경우 갱신
						answer = temp;
					}
				}
			}
		}
		
		// 순회를 마치면 리턴
		return answer;
	}

}