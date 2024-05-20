import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine().replace("D-", ""));
			if (a < 91) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
