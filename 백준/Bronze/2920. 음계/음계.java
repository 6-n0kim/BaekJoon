import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		String[] rs = { "ascending", "descending", "mixed" };

		if (str.equals("1 2 3 4 5 6 7 8")) {
			System.out.println(rs[0]);
		} else if (str.equals("8 7 6 5 4 3 2 1")) {
			System.out.println(rs[1]);
		} else {
			System.out.println(rs[2]);
		}
	}
}
