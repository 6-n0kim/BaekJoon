import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int answer = Integer.parseInt(br.readLine());

			if (answer == 1) {
				sb.append(1 + "\n");
			}
			else if (answer == 2) {
				sb.append(2 + "\n");
			}
			else if (answer == 3) {
				sb.append(4 + "\n");
			}
			else if (answer == 4) {
				sb.append(7 + "\n");
			}
			else if (answer == 5) {
				sb.append(13 + "\n");
			}
			else if (answer == 6) {
				sb.append(24 + "\n");
			}
			else if (answer == 7) {
				sb.append(44 + "\n");
			}
			else if (answer == 8) {
				sb.append(81 + "\n");
			}
			else if (answer == 9) {
				sb.append(149 + "\n");
			}
			else if (answer == 10) {
				sb.append(274 + "\n");
			}
			else if (answer == 11) {
				sb.append(504 + "\n");
			}
			else if (answer == 12) {
				sb.append(927 + "\n");
			}
		}
		System.out.println(sb);
	}
}
