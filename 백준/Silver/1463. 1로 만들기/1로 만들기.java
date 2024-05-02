import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		dp = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				dp[i] = 0;
			} else if (i == 2 || i == 3) {
				dp[i] = 1;
			} else {
					
					int min = Integer.MAX_VALUE;
					if (i % 2 == 0 && min > dp[i / 2] + 1) {
						min = dp[i / 2] + 1;
					}
					if (i % 3 == 0 && min > dp[i / 3] + 1) {
						min = dp[i / 3] + 1;
					}
					if (min > dp[i - 1] + 1) {
						min = dp[i - 1] + 1;
					}

					dp[i] = min;
				
			}
		}
			System.out.println(dp[n]);
	}
}