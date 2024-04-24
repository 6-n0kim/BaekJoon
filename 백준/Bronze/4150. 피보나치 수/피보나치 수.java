import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	private static BigInteger arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		arr = new BigInteger[n + 1];
		arr[0] = BigInteger.ZERO;
		arr[1] = BigInteger.ONE;
		if (n>1) {
			arr[2] = BigInteger.ONE;
		}
		if (n > 2) {
			for (int i = 2; i < arr.length; i++) {
				arr[i] = arr[i - 1].add(arr[i - 2]);
			}
		}
		System.out.println(arr[n]);
	}
}
