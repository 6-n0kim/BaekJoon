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
		
		if (n+m+k >= 100 ) {
			System.out.println("OK");
		}else {
			int a = Math.min(m, Math.min(n, k));
			if (a == n) {
				System.out.println("Soongsil");
			}
			if (a == m) {
				System.out.println("Korea");
			}
			if (a == k) {
				System.out.println("Hanyang");
			}
		}
	}
}