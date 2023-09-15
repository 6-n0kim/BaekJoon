import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			int a = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j)=='(') {
					a++;
				}else {
					a--;
				}
				if (a<0) {
					break;
				}
			}
			if (a==0) {
				sb.append("YES\n");
			}else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb);
	}
}