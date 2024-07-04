import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			BigInteger bi = new BigInteger(br.readLine());
			
			if (bi.remainder(BigInteger.valueOf(2)) == BigInteger.ZERO ) {
				System.out.println("even");
			}else System.out.println("odd");
		}
	}
}