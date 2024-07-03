import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int a = 0;
		int b = 0;
		for (int i = 0; i < s.length() - 2; i++) {
			if (s.substring(i, i + 3).equals("JOI")) {
				a++;
			}if (s.substring(i, i + 3).equals("IOI")) {
				b++;
			}
		}
		System.out.println(a);
		System.out.println(b);
	}
}