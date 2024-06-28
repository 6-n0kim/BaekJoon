import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String a = s.substring(0,1);
			String b = s.substring(1);
			a = a.toUpperCase();
			System.out.println(a+b);
		}
	}
}