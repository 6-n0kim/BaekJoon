import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		while (true) {
			sb = new StringBuilder();
			String s  = br.readLine();
			if (s.equals("END")) {
				break;
			}
			System.out.println(sb.append(s).reverse());
		}

	}
}