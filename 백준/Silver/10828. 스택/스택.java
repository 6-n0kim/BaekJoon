import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String s = br.readLine().replace("push ", "");
			if (s.equals("top")) {
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.peek()).append("\n");
				}
			} else if (s.equals("size")) {
				sb.append(stack.size()).append("\n");
			} else if (s.equals("pop")) {
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.pop()).append("\n");
				}
			} else if (s.equals("empty")) {
				sb.append(stack.empty() ? 1 : 0).append("\n");
			} else {
				stack.push(Integer.parseInt(s));
			}
		}
		System.out.println(sb);
	}
}