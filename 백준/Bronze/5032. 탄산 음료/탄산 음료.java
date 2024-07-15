import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		a += Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int c = 0;
		while (a >= b) {
			c += a / b;
			int r = a % b;
			a /= b;
			a += r;
		}
		System.out.println(c);
	}
}