import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int a = fn(k, n);
			sb.append(a + "\n");
		}
		System.out.println(sb);
	}

	private static int fn(int k, int n) {
		int a = 0;
		if (k == 0) {
			a += n;
		} else {
			for (int i = 1; i <= n; i++) {
				a += fn(k - 1, i);
			}
		}
		return a;
	}
}