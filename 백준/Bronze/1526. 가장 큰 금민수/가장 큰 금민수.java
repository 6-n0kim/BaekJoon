import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = n; i > 3; i--) {
			String s = String.valueOf(i);
			boolean a = true;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '4' || s.charAt(j) == '7') {
				} else {
					a = false;
					break;
				}
			}
			if (a) {
				sb.append(i);
				break;
			}
		}
		System.out.println(sb);
	}
}
