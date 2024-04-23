import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int max = 0 ;
		while (k > 0) {
			max = Math.max(n / 2, m);
			
			if (max == n / 2) {
				n -= 1;
				k -= 1;
			} else if (max == m) {
				m -= 1;
				k -= 1;
			}
		}
		int min = Math.min(n / 2, m);
		
		System.out.println(min);
	}
}
