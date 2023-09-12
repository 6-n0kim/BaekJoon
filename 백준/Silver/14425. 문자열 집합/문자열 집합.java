
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Boolean> map1 = new HashMap<>();
		Map<String, Boolean> map2 = new HashMap<>();
		String nm [] = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		for (int i = 0; i < n; i++) {
			map1.put(br.readLine(), true);
		}

		String arr[] = new String[m];
		for (int i = 0; i < m; i++) {
			String a = br.readLine();
			arr[i] = a;
			map2.put(a, map1.containsKey(a));
		}
		int sum = 0;
		for (String i : arr) {
			if(map2.get(i))sum++;
		}
		System.out.println(sum);
	}
}