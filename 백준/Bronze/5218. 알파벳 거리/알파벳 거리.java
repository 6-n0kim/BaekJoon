import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			int c = 0;

			System.out.print("Distances: ");
			for (int j = 0; j < a.length(); j++) {
				int x = a.charAt(j) - 'A';
				int y = b.charAt(j) - 'A';
				if (x > y) {
					y += 26;
				}
				c = y-x;
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
