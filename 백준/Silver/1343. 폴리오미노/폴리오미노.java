import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char arr[] = br.readLine().toCharArray();
		int cnt = 0;
		for (char c : arr) {
			if (c == 'X') {
				cnt++;
			} else if (c == '.') {
				if (cnt % 2 != 0) {
					sb.setLength(0);
					sb.append(-1);
					break;
				} else {
					while (cnt >= 4) {
						sb.append("AAAA");
						cnt -= 4;
					}
					while (cnt >= 2) {
						sb.append("BB");
						cnt -= 2;
					}
					sb.append(".");
				}
			} else {
				sb.setLength(0);
				sb.append(-1);
				break;
			}
		}
		if (cnt % 2 == 0) {
			sb.append(fn(cnt));
		}else {
			sb.setLength(0);
			sb.append(-1);
		}
		System.out.println(sb);
	}

	private static String fn(int cnt) {
		String s = "";
		while (cnt >= 4) {
			s += "AAAA";
			cnt -= 4;
		}
		while (cnt >= 2) {
			s += "BB";
			cnt -= 2;
		}
		return s;
	}
}
