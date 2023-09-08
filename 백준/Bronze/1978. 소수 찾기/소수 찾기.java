import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int cnt = 0;
		while (a-->0) {
			int n = Integer.parseInt(st.nextToken());
			int b = 0;
				for (int i = 1; i < n; i++) {
					if (n % i ==0) {
						b++;
					}
				}
				if (b==1) {
					cnt++;
				}
			}
		System.out.println(cnt);
	}
}
