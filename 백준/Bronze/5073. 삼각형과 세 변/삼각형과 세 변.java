import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int max = Math.max(a, Math.max(c, b));
			if (a == b && b == c && c == 0) {
				break;
			} else if (max * 2 >= a + b + c) {
				sb.append("Invalid").append("\n");
			} else if (a == b && b == c) {
				sb.append("Equilateral").append("\n");
			} else if (a == b || b == c || a == c) {
				sb.append("Isosceles").append("\n");
			} else {
				sb.append("Scalene").append("\n");
			}
		}
		System.out.println(sb);
	}
}