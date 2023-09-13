import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm[] = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		int cnt=0;
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int s = Integer.parseInt(st.nextToken());
			map.put(s, 0);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int s = Integer.parseInt(st.nextToken());
			map2.put(s, 0);
			if (map.containsKey(s)) cnt++;
		}
		System.out.println(map.size()+map2.size()- cnt*2);
	}
}