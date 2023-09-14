import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		long a = Long.parseLong(br.readLine());
		while (true) {
			if (a == 0 || a == 1 || a == 2) {
				System.out.println(2);
				break;
			}
			int cnt = 0;
			for (int j = 2; j <= Math.sqrt(a); j++) {
				if (a % j == 0) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				sb = new StringBuilder();
				String s = sb.append(a).reverse().toString();
				if (String.valueOf(a).equals(s)) {
					System.out.println(a);
					break;
				} 
			}
			a++;
		}
	}
}