import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String s = br.readLine();
			if (s.equals("0")) {
				break;
			}
			BigInteger bi = new BigInteger(s);
			String str = bi.mod(new BigInteger("42"))==BigInteger.ZERO ? "PREMIADO" : "TENTE NOVAMENTE" ;
			sb.append(str+"\n");
		}
		System.out.println(sb);
	}
}