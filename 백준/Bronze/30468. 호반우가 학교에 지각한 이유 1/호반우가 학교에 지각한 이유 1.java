import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken()),
				l = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken()),
				n = Integer.parseInt(st.nextToken());

		int sum = s + t + l + d;
		int answer = n * 4 - sum;

		if (sum >= n * 4) {
			answer = 0;
		}
		System.out.println(answer);

	}
}
