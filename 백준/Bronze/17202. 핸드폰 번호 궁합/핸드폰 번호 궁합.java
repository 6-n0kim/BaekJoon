import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr1[] = br.readLine().split("");
		String arr2[] = br.readLine().split("");
		String s = "";
		for (int i = 0; i < arr2.length; i++) {
			s += arr1[i] + arr2[i];
		}
		while (s.length()>2) {
			String rs = "";
			for (int i = 0; i < s.length() - 1; i++) {
				int n = s.charAt(i) - '0';
				int m = s.charAt(i + 1) - '0';
				rs += (n + m) % 10;
			}
			s = rs;
		}
		System.out.println(s);
	}
}
