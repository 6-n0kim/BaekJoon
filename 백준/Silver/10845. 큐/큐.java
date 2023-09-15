import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		Queue<Integer> que = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int last = -1;
		for (int i = 0; i < n; i++) {
			String s = br.readLine().replace("push ", "");
			if (s.equals("front")) {
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.peek()).append("\n");
				}
			} else if (s.equals("size")) {
				sb.append(que.size()).append("\n");
			} else if (s.equals("pop")) {
				if (que.isEmpty()) {
					last = -1;
					sb.append(last).append("\n");
				} else {
					sb.append(que.poll()).append("\n");
				}
			} else if (s.equals("empty")) {
				sb.append(que.isEmpty() ? 1 : 0).append("\n");
			} else if (s.equals("back")) {
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(last).append("\n");
				}
			} else {
				last = Integer.parseInt(s);
				que.offer(last);
			}
		}
		System.out.println(sb);
	}
}