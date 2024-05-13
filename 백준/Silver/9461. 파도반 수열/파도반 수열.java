import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long p[] = new long[101];
		p[1] = 1;
		p[2] = 1;
		p[3] = 1;
		p[4] = 2;
		p[5] = 2;
		for (int i = 6; i < p.length; i++) {
			p[i] = p[i - 1] + p[i - 5];
		}
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			System.out.println(p[m]);
		}
	}
}
