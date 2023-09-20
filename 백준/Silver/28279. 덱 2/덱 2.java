import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Deque<Integer> que = new ArrayDeque<>();
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			if (s.indexOf("1 ") > -1) {
				que.addFirst(Integer.parseInt(s.replace("1 ", "")));
			} else if (s.indexOf("2 ") > -1) {
				que.addLast(Integer.parseInt(s.replace("2 ", "")));
			} else if (s.equals("3")) {
				if (que.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(que.pollFirst() + "\n");
				}
			} else if (s.equals("4")) {
				if (que.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(que.pollLast() + "\n");
				}
			} else if (s.equals("5")) {
				sb.append(que.size() + "\n");
			} else if (s.equals("6")) {
				if (que.isEmpty()) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
			} else if (s.equals("7")) {
				if (que.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(que.peekFirst() + "\n");
				}
			} else if (s.equals("8")) {
				if (que.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(que.peekLast() + "\n");
				}
			}
		}
		System.out.println(sb);
	}
}