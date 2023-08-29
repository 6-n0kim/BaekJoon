import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(factorial(n));
	}

	public static BigInteger factorial(int n) {
		BigInteger bi = new BigInteger("1");

		for (int i = 1; i <= n; i++) {
			bi = bi.multiply(BigInteger.valueOf(i));
		}
		return bi;
	}
}