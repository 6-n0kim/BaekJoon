import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		String s = "";
		if (n >= m) {
			s = "Congratulations, you are within the speed limit!";
		} else if (m - n < 21) {
			s = "You are speeding and your fine is $100.";
		} else if (m - n < 31) {
			s = "You are speeding and your fine is $270.";
		} else {
			s = "You are speeding and your fine is $500.";
		}
		System.out.println(s);
	}
}
