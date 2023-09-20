import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < t; i++) {
			que.offer(Integer.parseInt(st.nextToken()));
		}

		int n = 1;
		String pass = "Nice";
		while (n < t) {
			if (!que.isEmpty() && que.peek() == n) {
				que.poll();
				n++;
			} else if (!stack.empty() && stack.peek() == n) {
				stack.pop();
				n++;
			} else if (!que.isEmpty()) {
				stack.push(que.poll());
			} else {
				pass = "Sad";
				break;
			}
		}
		System.out.println(pass);
	}
}
