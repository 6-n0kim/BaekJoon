import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] num = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		int rs = 0;
		for (int i = 0; i < num.length - 2; i++) {
			if (num[i] > m)
				continue;
			for (int j = i + 1; j < num.length - 1; j++) {
				if (num[i] + num[j] > m)
					continue;
				for (int k = j + 1; k < num.length; k++) {
					if (num[i] + num[j] + num[k] <= m && num[i] + num[j] + num[k] > rs) {
						rs = num[i] + num[j] + num[k];
					}
				}
			}
		}
		System.out.println(rs);
	}
}