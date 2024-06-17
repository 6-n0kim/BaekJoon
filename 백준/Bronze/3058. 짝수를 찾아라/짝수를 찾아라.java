import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int min = 101;
			int sum = 0;
			for (int j = 0; j < 7; j++) {
				int a = Integer.parseInt(st.nextToken());
				if (a % 2 == 0) {
					sum += a;
					if (min > a) {
						min = a;
					}
				}
			}
			System.out.println(sum + " " + min);
		}

	}
}
