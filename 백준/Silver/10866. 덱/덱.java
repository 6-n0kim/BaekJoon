import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws Exception {
		Deque<Integer> que = new ArrayDeque<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine().replace("push_front ", "").replace("push_back ", "-");
			if (s.equals("pop_back")) {
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.pollLast()).append("\n");
				}

			} else if (s.equals("pop_front")) {
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.pollFirst()).append("\n");
				}

			} else if (s.equals("size")) {
				sb.append(que.size()).append("\n");

			} else if (s.equals("empty")) {
				sb.append(que.isEmpty() ? 1 : 0).append("\n");

			} else if (s.equals("front")) {
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.peekFirst()).append("\n");
				}

			} else if (s.equals("back")) {
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.peekLast()).append("\n");
				} 

			} else if (Integer.parseInt(s) > 0) {
				que.addFirst(Integer.parseInt(s));
			} else {
				que.addLast(Math.abs(Integer.parseInt(s)));
			}
		}
		System.out.println(sb);
	}
}