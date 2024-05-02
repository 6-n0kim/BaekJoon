import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		dp = new int[n + 1];

		int arr[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			dp[i] = Integer.parseInt(br.readLine());

			if (i == 1) {
				arr[i] = dp[i];
			} else if (i == 2) {
				arr[i] = dp[1] + dp[2];
			} else if (i == 3) {
				arr[i] = Math.max(dp[1], dp[2]) + dp[3];
			} else {
				arr[i] = dp[i] + Math.max(arr[i - 3] + dp[i - 1], arr[i - 2]);
			}
		}
		System.out.println(arr[n]);
	}
}