import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		String arr[] = { "000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010" };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		int idx = 0;
		int cnt = 1;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < arr.length; j++) {
				map.put(j, 0);
			}
			
			for (int j = 0 + idx; j < 6 + idx; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (s.charAt(j) != arr[k].charAt(j - idx)) {
						map.put(k, map.getOrDefault(k, 0) + 1);
					}
				}
			}

			for (int j = 0; j < map.size(); j++) {
				if (map.get(j) == 0 || map.get(j) == 1) {
					char word = (char) (j + 'A');
					sb.append(word);
				}
			}

			if (sb.length() != cnt) {
				sb.setLength(0);
				sb.append(i + 1);
				break;
			}
			cnt++;
			idx += 6;

		}

		System.out.println(sb);
	}
}
