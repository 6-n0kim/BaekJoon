import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int a = s.charAt(0) - '0';
		int b = s.charAt(1) - '0';
		int c = s.charAt(2) - '0';
		int d = s.charAt(3) - '0';
		for (int i = 8; i > 0; i /= 2) {
			if (a >= i) {
				a -= i;
				sb.append("* ");
			} else {
				sb.append(". ");
			}
			if (b >= i) {
				b -= i;
				sb.append("*   ");
			} else {
				sb.append(".   ");
			}
			if (c >= i) {
				c -= i;
				sb.append("* ");
			} else {
				sb.append(". ");
			}
			if (d >= i) {
				d -= i;
				sb.append("*");
			} else {
				sb.append(".");
			}
			
			sb.append("\n");
		}
		sb.setLength(sb.length()-1);
		System.out.println(sb);
	}
}