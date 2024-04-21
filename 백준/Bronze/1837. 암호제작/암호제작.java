import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger s = new BigInteger(st.nextToken()), t = new BigInteger(st.nextToken());
		BigInteger bi = new BigInteger("1");

		while (true) {
			bi = bi.add(BigInteger.ONE);
			if (s.remainder(bi).compareTo(BigInteger.ZERO) == 0 && bi.compareTo(t) == -1) {
				System.out.println("BAD " + bi);
				break;
			}
			if (bi.compareTo(t) > -1) {
				System.out.println("GOOD");
				break;
			}

		}
	}
}
