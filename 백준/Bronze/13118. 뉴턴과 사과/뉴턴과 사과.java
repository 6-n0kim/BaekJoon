import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		if (a==x) {
			ans = 1;
		}
		if (b==x) {
			ans = 2;
		}
		if (c==x) {
			ans = 3;
		}
		if (d==x) {
			ans = 4;
		}
		
		System.out.println(ans);
	}
}
