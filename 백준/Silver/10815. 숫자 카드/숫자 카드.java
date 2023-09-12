import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Map<Integer, Boolean> map1 =new HashMap<>();
		Map<Integer, Boolean> map2 =new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			map1.put(Integer.parseInt(st.nextToken()), true);
		}
		
		int m = Integer.parseInt(br.readLine());
		int arr []= new int [m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i]= a;
			map2.put(a,map1.containsKey(a));
		}
		for (int i :arr) {
			sb.append(map2.get(i) ? 1 : 0).append(" ");
		}
		System.out.println(sb);
	}
}