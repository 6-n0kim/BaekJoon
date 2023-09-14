import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine());
		int a = 0;
		String[] s = br.readLine().split("");
		for (int i = 0; i < s.length; i++) {
			if (s[i].matches("[aeiou]")) {
				a++;
			}
		}
		System.out.println(a);
	}
}