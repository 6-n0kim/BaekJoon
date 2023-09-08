import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			List<Integer> list = new ArrayList<>();
			StringBuilder sb = new StringBuilder();
			int a = Integer.parseInt(br.readLine());
			if (a == -1) {
				break;
			}
			for (int i = 1; i < a; i++) {
				if (a % i == 0) {
					list.add(i);
				}
			}

			sb.append(a + " ");
			if (a == list.stream().mapToInt(i -> i).sum()) {
				int arr[] = list.stream().mapToInt(i -> i).toArray();
				sb.append("= ");
				for (int i : arr) {
					sb.append(i + " + ");
				}
				sb.setLength(sb.length() - 2);

			} else {
				sb.append("is NOT perfect.");
			}
			System.out.println(sb);
		}
	}
}
