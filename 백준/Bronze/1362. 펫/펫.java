import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int o = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			boolean chk = true;
			if (o == w & o == 0) {
				break;
			}

			while (true) {
				st = new StringTokenizer(br.readLine());
				String a = st.nextToken();
				int b = Integer.parseInt(st.nextToken());

				if (a.equals("#") & b == 0) {
					break;
				}

				if (a.equals("F")) {
					w += b;
				} else if (a.equals("E")) {
					w -= b;
				}

				if (w < 1) {
					chk = false;
				}

			}
			if (chk) {
				if (o / 2 < w && o * 2 > w) {
					System.out.println(num + " :-)");
				} else if (w > 0) {
					System.out.println(num + " :-(");
				}
			} else {
				System.out.println(num + " RIP");
			}
			num++;
		}
	}
}
