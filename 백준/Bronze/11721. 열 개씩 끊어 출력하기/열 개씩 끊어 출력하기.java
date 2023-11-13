import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int n = s.length();
		int m = n / 10;
		int k = n % 10;
		int idx = 0;
		for (int i = 0; i < m; i++) {
			for (int j = idx; j < idx + 10; j++) {
				sb.append(s.charAt(j));
			}
			idx += 10;
			sb.append("\n");
		}
		for (int i = idx; i < idx + k; i++) {
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}
}