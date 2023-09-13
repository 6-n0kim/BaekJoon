import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = b - a;
			sb.append(fn(c)).append("\n");
		}
		System.out.println(sb);
	}

	private static int fn(int c) {
		int max = (int) Math.sqrt(c);
		int rs = 2 * max;
		if (max == Math.sqrt(c)) {
			rs -= 1;
		} else if (c <= max * max + max) {
		} else {
			rs += 1;
		}
		return rs;
	}
}