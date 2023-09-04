import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = b;
		while (b > 0) {
			sb.append(a * (b % 10)).append("\n");
			b /= 10;
		}
		sb.append(a * c);
		System.out.println(sb);
	}
}