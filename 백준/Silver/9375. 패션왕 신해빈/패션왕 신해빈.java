import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			for (int j = 0; j < m; j++) {
				String s = br.readLine().split(" ")[1];
				map.put(s, map.getOrDefault(s, 1) + 1);
			}
			int sum = 1;
			for (Entry<String, Integer> e : map.entrySet()) {
				sum *= e.getValue();
			}
			System.out.println(sum - 1);
		}
	}
}
