import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> list = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		sb.append('<');

		int idx = 0;
		while (n > 0) {
			idx = (idx + (k - 1)) % n;
			sb.append(list.remove(idx) + ", ");
			n--;
		}
		sb.setLength(sb.length() - 2);
		sb.append(">");
		System.out.println(sb);
	}
}