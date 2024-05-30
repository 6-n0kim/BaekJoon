import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			int a = 0;
			int b = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'A') {
				a++;
			}else {
				b++;
			}
		}
		if (a>b) {
			s = "A";
		}else if (b>a) {
			s = "B";
		}else {
			s = "Tie";
		}
		System.out.println(s);
	}
}
