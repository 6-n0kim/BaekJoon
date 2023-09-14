import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb =new StringBuilder();
		Map<String,Integer> map = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			map.put(st.nextToken(), 0);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			if (!map.containsKey(st.nextToken())) {
				sb.append(0+"\n");
			}else {
				sb.append(1+"\n");
			}
		}
		System.out.println(sb);
	}
}