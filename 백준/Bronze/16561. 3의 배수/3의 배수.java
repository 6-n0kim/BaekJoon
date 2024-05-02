import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int dp[] = new int[n / 3 + 1];

		for (int i = 1; i < dp.length; i++) {
			if (i == 1 || i == 2) {
				dp[i] = 0;
			} else {
				dp[i] = dp[i - 1] + i - 2;
			}
		}
		System.out.println(dp[n/3]);
	}
}
