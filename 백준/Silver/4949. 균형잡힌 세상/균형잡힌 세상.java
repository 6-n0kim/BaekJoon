import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		while (true) {
			String s = br.readLine();
			if (s.equals("."))
				break;
			boolean chk = true;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					stack.add(s.charAt(i));
				}
				if (s.charAt(i) == ')') {
					if (!stack.empty() && stack.peek() == '(') {
						stack.pop();
					} else {
						chk = false;
						break;
					}
				}
				if (s.charAt(i) == '[') {
					stack.add(s.charAt(i));
				}
				if (s.charAt(i) == ']') {
					if (!stack.empty() && stack.peek() == '[') {
						stack.pop();
					} else {
						chk = false;
						break;
					}
				}
			}
			if (chk && stack.size() == 0) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
			stack.setSize(0);
		}
		System.out.println(sb);
	}
}