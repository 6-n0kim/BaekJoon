import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {

		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 3; i++) {
			int setN = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
			for (int j = 0; j < setN; j++) {
				sum = sum.add(new BigInteger(br.readLine()));
			}
			if (sum.toString().equals("0")) {
				sb.append(0).append("\n");
			} else if (sum.compareTo(new BigInteger("0")) > 0) {
				sb.append("+").append("\n");
			} else {
				sb.append("-").append("\n");
			}
		}
		System.out.println(sb);
	}
}