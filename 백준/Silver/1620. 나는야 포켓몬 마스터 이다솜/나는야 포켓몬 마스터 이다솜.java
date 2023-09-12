import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String nm[] = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);

		String arr[] = new String[n];
		Map<String, Integer> map = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			String s = br.readLine();
			map.put(s, i);
			arr[i - 1] = s;
		}
		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			try {
				sb.append(arr[Integer.parseInt(s)-1]).append("\n");
			} catch (Exception e) {
				sb.append(map.get(s)).append("\n");
			}
		}
		System.out.println(sb);
	}
}