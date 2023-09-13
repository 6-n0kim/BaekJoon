
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int min = Math.min(a, b);
			int mul = 1;
			while (true) {
				if (min * mul % a == 0 && min * mul % b == 0) {
					break;
				} else {
					mul++;
				}
			}
			sb.append(min*mul).append("\n");
		}
		System.out.println(sb);
	}
}