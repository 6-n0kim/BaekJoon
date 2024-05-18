import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		int arr[] = new int[302];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i + arr[i - 1];
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());


		for (int i = 0; i < n; i++) {
			long sum = 0;
			int a = Integer.parseInt(br.readLine());
			
			for (int k = 1; k <= a; k++) {
				sum += k*arr[k+1];
			}
			System.out.println(sum);
		}
	}
}
