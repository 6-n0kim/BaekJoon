import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> que = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());

			if (a == 0) {
				if (que.isEmpty()) {
					sb.append(0 + "\n");
				} else {
					sb.append(que.poll() + "\n");
				}
			} else {
				que.add(a);
			}
		}
		System.out.println(sb);
	}

}
