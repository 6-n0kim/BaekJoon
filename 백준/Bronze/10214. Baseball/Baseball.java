import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			int a = 0;
			int b = 0;
			for (int j = 0; j < 9; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				a += Integer.parseInt(st.nextToken());
				b += Integer.parseInt(st.nextToken());
			}
			if (a > b) {
				System.out.println("Yonsei");
			} else if (a < b) {
				System.out.println("Korea");
			} else {
				System.out.println("Draw");
			}
		}
	}
}
