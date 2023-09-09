import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		if (s.equals("M")) {
			sb.append("MatKor");
		}
		if (s.equals("W")) {
			sb.append("WiCys");
		}

		if (s.equals("C")) {
			sb.append("CyKor");
		}
		if (s.equals("A")) {
			sb.append("AlKor");
		}
		if (s.equals("$")) {
			sb.append("$clear");
		}
		System.out.println(sb);
	}
}