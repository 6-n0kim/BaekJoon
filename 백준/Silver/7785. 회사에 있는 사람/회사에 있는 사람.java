import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<>();
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			String s2 = st.nextToken();
			if (map.containsKey(s)) {
				map.remove(s);
			} else {
				map.put(s, s2);
			}
		}
		List<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list, Collections.reverseOrder());
		for (String s : list) {
			sb.append(s + "\n");
		}
		System.out.println(sb);
	}
}