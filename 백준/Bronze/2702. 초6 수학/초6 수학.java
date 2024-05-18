import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			a = max;
			b = min;

			int r = -1;
			while (r != 0) {
				r = max % min;
				max = min;
				min = r;
			}
			System.out.println(a * b / max + " " + max);
		}
	}
}