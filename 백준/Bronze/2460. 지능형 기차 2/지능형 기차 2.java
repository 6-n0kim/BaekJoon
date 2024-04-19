import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());

			in -= s;
			in += t;

			if (in > max) {
				max = in;
			}
		}
		System.out.println(max);

	}
}
