import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Queue<Integer> que = new LinkedList<>();
		int last = 0;
		for (int i = 0; i < t; i++) {
			String arr[] = br.readLine().split(" ");
			String s = arr[0];
			int num = 0;
			if (arr.length > 1) {
				num = Integer.parseInt(arr[1]);
			}

			if (s.equals("push")) {
				que.offer(num);
				last = num;
			} else if (s.equals("pop")) {
				if (que.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(que.poll() + "\n");
				}
			} else if (s.equals("size")) {
				sb.append(que.size() + "\n");
			} else if (s.equals("empty")) {
				if (que.isEmpty()) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
			} else if (s.equals("front")) {
				if (que.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(que.peek() + "\n");
				}
			} else if (s.equals("back")) {
				if (que.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(last + "\n");
				}
			}
		}
		System.out.println(sb);
	}
}