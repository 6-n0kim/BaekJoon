import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		System.out.println(fact(1, n));
	}

	public static BigInteger fact(int a, int n) {
		BigInteger bi = BigInteger.valueOf(a);

		if (a < n) {
			int b = (a + n) / 2;
			bi = fact(a, b).multiply(fact(b + 1, n)); // 두개로 나눠서 풀이
		}
		return bi;
	}
}