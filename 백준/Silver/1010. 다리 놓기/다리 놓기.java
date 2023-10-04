import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	static BigInteger dp[] = new BigInteger[30];

	public static void main(String[] args) throws Exception {
		dp[0] = BigInteger.ONE;
		dp[1] = BigInteger.ONE;
		dp[2] = BigInteger.TWO;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			System.out.println(fact(a)
					.divide(fact(a - b))
					.divide(fact(b)));
		}
	}

	public static BigInteger fact(int n) {
		if (dp[n] == null) {
			dp[n] = fact(n - 1).multiply(new BigInteger(String.valueOf(n)));
		}
		return dp[n];
	}

}