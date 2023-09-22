import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		int arr[]= new int [1001];
		int idx = 1;
		int num = 1;
		boolean go = true;
		while(go) {
			for (int j = 0; j < num; j++) {
				if (idx > 1000) {
					go=false;
					break;
				}
				arr[idx++]=num;
			}
			num++;
		}
		int sum =0;
		for (int i = start; i <= end; i++) {
			sum+= arr[i];
		}
		System.out.println(sum);
	}
}