import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String nm[] = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			map.put(s, 0);
		}
		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			if(map.containsKey(s))map.put(s, 1);
		}
		List<String> list = map.entrySet()
			    .stream()
			    .filter(e -> e.getValue() == 1)
			    .map(Map.Entry::getKey)
			    .collect(Collectors.toList());
		Collections.sort(list);
		sb.append(list.size()).append("\n");
		for(String s : list)sb.append(s).append("\n");
		System.out.println(sb);
	}
}