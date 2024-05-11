import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int x = 0;
			int z = Integer.MAX_VALUE;
			while (a * x <= b) {
				z = b - (a * x) < z ? b - (a * x) : z;
				
				x++;
			}
			sum+=z;
		}
		System.out.println(sum);
	}
}