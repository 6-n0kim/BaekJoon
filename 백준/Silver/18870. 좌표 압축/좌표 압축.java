import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int arr[] = new int[a]; // 2 4 -10 4 -9
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();

		int arr2[] = arr.clone();
		Arrays.sort(arr2);

		Map<Integer, Integer> map = new HashMap<>();

		int idx = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (!map.containsKey(arr2[i]))
				map.put(arr2[i], idx++);
		}

		for (int i : arr) {
			sb.append(map.get(i)).append(" ");
		}
		System.out.println(sb);
	}
}