import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String s = br.readLine();
		if (s.charAt(0) == '0') {
			if (s.charAt(1) == 'x') {
				n = Integer.parseInt(s.substring(2), 16);
			} else {
				// 8
				n = Integer.parseInt(s.substring(1), 8);
			}
		} else {
			// 10
			n = Integer.parseInt(s);
		}
		System.out.println(n);
	}
}