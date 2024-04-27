import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int max = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			int sum = 0;

			if (a == b && a == c) {
				sum = 10000 + a * 1000;
			} else if (a != b && a != c && b != c) {
				int top = Math.max(Math.max(a, b), c);
				sum = top * 100;
			} else {
				int same = 0;
				if (a - b == 0) {
					same = a;
				} else if (b - c == 0) {
					same = b;
				} else {
					same = c;
				}
				sum = same * 100 + 1000;
			}
			if (max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
