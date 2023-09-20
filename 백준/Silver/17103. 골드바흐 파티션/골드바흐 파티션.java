import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		boolean arr[] = new boolean[1000001];

		arr[0] = arr[1] = true;
		for (int i = 2; i * i < arr.length; i++) {
			if (!arr[i]) {
				for (int j = i * i; j < arr.length; j += i) {
					arr[j] = true;
				}
			}
		}

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			for (int i = 2; i <= n / 2; i++) {
				if (!arr[i] && !arr[n - i]) {
					cnt++;
				}
			}
			sb.append(cnt + "\n");
		}
		System.out.println(sb);
	}
}
