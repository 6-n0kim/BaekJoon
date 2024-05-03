import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int cnt;
	static int arr[][];
	static boolean chk[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int sum[] = new int[n + 1];

		int total = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			total += Integer.parseInt(st.nextToken());
			sum[i] = total;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(sum[b] - sum[a - 1]);
		}
	}
}
