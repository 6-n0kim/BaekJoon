import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int cont = 0;
		int sum = 0;
		for (int j = 0; j < n; j++) {
			int m = Integer.parseInt(st.nextToken());
			if (m == 1) {
				cont++;
			} else {
				cont = 0;
			}
			sum += cont;
		}
		System.out.println(sum);

	}
}
