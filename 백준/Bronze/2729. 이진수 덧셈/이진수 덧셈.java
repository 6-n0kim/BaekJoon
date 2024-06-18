import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String a1 = st.nextToken();
			String b1 = st.nextToken();

			BigInteger a2 = new BigInteger(a1, 2);
			BigInteger b2 = new BigInteger(b1, 2);

			BigInteger ans = a2.add(b2);
			sb.append(ans.toString(2) + "\n");
		}

		System.out.println(sb.toString());

	}
}
