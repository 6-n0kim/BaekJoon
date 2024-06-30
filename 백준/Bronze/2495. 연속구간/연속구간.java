import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 3; i++) {
			String a = br.readLine();
			int cnt = 1;
			int max = 1;
			char c = a.charAt(0);
			for (int j = 1; j < a.length(); j++) {
				if (c == a.charAt(j)) {
					cnt++;
					if (cnt > max) {
						max = cnt;
					}
				} else {
					c = a.charAt(j);
					cnt = 1;
				}
			}
			System.out.println(max);
		}
	}
}