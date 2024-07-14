import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger bi = new BigInteger(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (bi.divideAndRemainder(BigInteger.valueOf(2))[0].compareTo(BigInteger.ONE) >= 0) {
			sb.append(bi.divideAndRemainder(BigInteger.valueOf(2))[1]);
			bi = bi.divideAndRemainder(BigInteger.valueOf(2))[0];
		}
		sb.append(bi);
		System.out.println(sb.reverse());
	}
}