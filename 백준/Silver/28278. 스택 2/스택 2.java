import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			if (s.indexOf("1 ") > -1) {
				stack.push(Integer.parseInt(s.replace("1 ", "")));
			} else if (s.equals("2")) {
				if (stack.empty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(stack.pop() + "\n");
				}
			} else if (s.equals("3")) {
				sb.append(stack.size() + "\n");
			} else if (s.equals("4")) {
				if (stack.empty()) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
			} else if (s.equals("5")) {
				if (stack.empty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(stack.peek() + "\n");
				}
			}
		}
		System.out.println(sb);
	}
}
