import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
		int sum = 0;
		String s = br.readLine();
		for (String str : s.split("X")) {
			sum += cac(str.length());
		}
		System.out.println(sum);
		}
	}

	public static int cac(int n) {
		int rs = 0;
		if (n == 0)
			return rs;

		for (int i = 1; i <= n; i++) {
			rs += i;
		}
		return rs;
	}
}
