import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			int cnt = 0;
			String s = br.readLine().toLowerCase();
			if (s.equals("#")) {
				break;
			} else {
				for (String str : s.split("")) {
					if (str.matches("[aeiou]")) {
						cnt++;
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
	}
}