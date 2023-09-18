import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	static BigInteger dp[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		dp = new BigInteger[501];
		int t = Integer.parseInt(br.readLine());
		dp[0] = dp[1] = BigInteger.ONE;
		int cnt = 0;
		BigInteger bi = fn(t);
		while (true) {
			if (bi.remainder(BigInteger.valueOf(10)) == BigInteger.ZERO) {
				cnt++;
				bi = bi.divide(BigInteger.valueOf(10));
			} else {
				break;
			}
		}
		System.out.println(cnt);
	}

	private static BigInteger fn(int n) {
		if (dp[n] == null) {
			dp[n] = fn(n - 1).multiply(new BigInteger(String.valueOf(n)));
		}
		return dp[n];
	}
}