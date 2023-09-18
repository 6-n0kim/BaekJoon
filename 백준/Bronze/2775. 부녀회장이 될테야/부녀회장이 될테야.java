import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int dp[][];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		dp = new int[15][15];
		for (int i = 0; i < dp.length; i++) {
			dp[0][i] = i;
		}
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int a = fn(k, n);
			sb.append(a + "\n");
		}
		System.out.println(sb);
	}

	private static int fn(int k, int n) {
		int a = 0;
		if (k == 0) {
			a += n;
		} else {
			for (int i = 1; i <= n; i++) {
				if (dp[k - 1][i] == 0) {
					dp[k - 1][i] = fn(k - 1, i);
				}
				a += dp[k - 1][i];
			}
			 dp[k][n] = a;
		}
		return a;
	}
}