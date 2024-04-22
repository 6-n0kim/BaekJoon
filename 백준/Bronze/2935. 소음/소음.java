import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger n = new BigInteger(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
	
		st = new StringTokenizer(br.readLine());
		BigInteger t = new BigInteger(st.nextToken());

		if (s.equals("+")) {
			System.out.println(n.add(t));
		}else {
			System.out.println(n.multiply(t));
		}
	}
}
