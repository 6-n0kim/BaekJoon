import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double n = Integer.parseInt(st.nextToken());
		double m = Integer.parseInt(st.nextToken());
		double a = n / m;
		String s = "";
		if (a >= 0.6) {
			s = "very strong";
		}
		if (a < 0.6) {
			s = "strong";
		}
		if (a < 0.4) {
			s = "normal";
		}
		if (a < 0.2) {
			s = "weak";
		}
		System.out.println(s);
	}
}