import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	static BigInteger dp[] = new BigInteger[500];

	public static void main(String[] args) throws Exception {
		dp[0] = BigInteger.ZERO;
		dp[1] = BigInteger.ONE;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == -1) {
				break;
			}
			sb.append("Hour " + n + ": " + fibo(n) + " cow(s) affected\n");
		}
		System.out.println(sb);
	}

	private static BigInteger fibo(int n) {
		if (n <= 1) {
			return dp[n];
		}
		if (dp[n] == null) {
			dp[n] = fibo(n - 1).add(fibo(n - 2));
		}
		return dp[n];
	}
}
