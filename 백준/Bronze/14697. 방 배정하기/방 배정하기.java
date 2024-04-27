import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		int answer = 0;

		for (int i = 0; i <= (n / a); i++) {
			for (int j = 0; j <= (n / b); j++) {
				for (int j2 = 0; j2 <= (n / c); j2++) {
					if (a * i + b * j + c * j2 == n) {
						answer = 1;
						break;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
