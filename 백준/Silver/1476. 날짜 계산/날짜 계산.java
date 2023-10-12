import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		if (e == 15) {
			e = 0;
		}
		if (s == 28) {
			s = 0;
		}
		if (m == 19) {
			m = 0;
		}
		for (int i = 1; i <= 10000; i++) {
			if (i % 15 == 0 && i % 28 == 0 && i % 19 == 0) {
				System.out.println(i);
				break;
			}
			if (i % 15 == e && i % 28 == s && i % 19 == m) {
				System.out.println(i);
				break;
			}
		}
	}
}
