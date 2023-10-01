import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);

		if (!s.contains("7")) {
			if (n % 7 == 0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		} else {
			if (n % 7 == 0) {
				System.out.println(3);
			}else {
				System.out.println(2);
			}
		}
	}
}