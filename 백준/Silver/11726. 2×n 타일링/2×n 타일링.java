import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long arr[] = new long[n + 1];

		for (int i = 1; i < arr.length; i++) {
			if (i == 1) {
				arr[i] = 1;
			} else if (i == 2) {
				arr[i] = 2;
			} else {
				arr[i] = ( arr[i - 1] + arr[i - 2] ) % 10007;
			}
		}
		System.out.println(arr[n]);
	}
}
