import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while (true) {
			String m = br.readLine();
			if (m == null || m.equals("")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(m);
			s += st.nextToken();
		}
		String arr[] = s.split(",");

		int n = 0;

		for (String a : arr) {
			n += Integer.parseInt(a);
		}

		System.out.println(n);
	}
}
