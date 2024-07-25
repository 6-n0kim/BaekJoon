import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			int a = Integer.parseInt(br.readLine());

			a += Integer.parseInt(sb.append(a).reverse().toString());
			sb.setLength(0);
			
			int b = Integer.parseInt(sb.append(a).reverse().toString());

			if (a == b)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}