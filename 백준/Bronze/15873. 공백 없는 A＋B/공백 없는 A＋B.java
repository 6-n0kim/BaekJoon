import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		if (n.length() == 4) {
			System.out.println(20);
		} else if (n.length() == 3) {
			int a = n.charAt(0) - '0';
			int c = n.charAt(2) - '0';
			if (c == 0) {
				System.out.println(10 + a);
			} else {
				System.out.println(10 + c);
			}
		} else {
			int a = n.charAt(0) - '0';
			int b = n.charAt(1) - '0';
			System.out.println(a + b);
		}
	}
}