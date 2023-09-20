import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		if (t<100) {
			System.out.println(t);
		}else {
			int cnt = 99;
			for (int i = 100; i <= t; i++) {
				String s = String.valueOf(i);
				int a = s.charAt(0);
				int b = s.charAt(1);
				int c = s.charAt(2);
				if (a-b == b-c) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
