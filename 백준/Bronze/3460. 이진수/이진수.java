import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			sb.append(Integer.toBinaryString(m)).reverse();
			for (int j = 0; j < sb.length(); j++) {
				if (sb.charAt(j) == '1') {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
