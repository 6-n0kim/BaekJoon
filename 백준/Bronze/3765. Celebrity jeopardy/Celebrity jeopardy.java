import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			}
			System.out.println(s);
		}
	}
}
