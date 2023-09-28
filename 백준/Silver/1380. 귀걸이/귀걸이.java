import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int sn = 1;
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			String arr[] = new String[n + 1];
			int arr2[] = new int[n + 1];
			for (int i = 1; i < n + 1; i++) {
				arr[i] = br.readLine();
			}
			for (int i = 0; i < 2 * n - 1; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int m = Integer.parseInt(st.nextToken());
				String s = st.nextToken();
				arr2[m]++;
			}
			for (int i = 1; i < arr2.length; i++) {
				if (arr2[i] % 2 != 0) {
					sb.append(sn++ + " " + arr[i]).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}