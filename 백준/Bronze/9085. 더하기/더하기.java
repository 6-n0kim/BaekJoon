import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			System.out.println(sum);
		}
	}
}
