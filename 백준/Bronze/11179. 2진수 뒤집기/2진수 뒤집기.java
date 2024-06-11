import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = Integer.toBinaryString(n);
		StringBuilder sb = new StringBuilder();
		s = sb.append(s).reverse().toString();
		n = Integer.parseInt(s, 2);
		System.out.println(n);
	}
}
