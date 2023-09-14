import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine())%14;
		String s = "WelcomeToSMUPC";
		if (n==0) {
			n+=14;
		}
		System.out.println(s.charAt(n-1));
	}
}