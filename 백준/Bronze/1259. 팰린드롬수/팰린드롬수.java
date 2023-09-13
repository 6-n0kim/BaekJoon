import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		StringBuilder rs = new StringBuilder();
		while (true) {
			sb = new StringBuilder();
			String s = br.readLine();
			sb.append(s);
			
			if (s.equals("0")) {
				break;
			} else if (s.equals(sb.reverse().toString())) {
				rs.append("yes\n");
			} else {
				rs.append("no\n");
			}
		}
		System.out.println(rs);
	}
}