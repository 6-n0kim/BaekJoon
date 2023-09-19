import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int lastNum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] == n) {
				lastNum = i;
			}
		}
		boolean pass = true;
		for (int i = lastNum; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				pass = false;
				break;
			}
		}
		if (pass) {
			Stack<Integer>stack = new Stack<>();
			int num = 1;
			for (int i = 0; i < n; i++) {
				int target = arr[i];
				while (target >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				
				if (target == stack.peek()) {
					stack.pop();
					sb.append("-\n");
				}
			}
			if (stack.size()>0) {
				sb.setLength(0);
				sb.append("NO");
			}
		}else {
			sb.append("NO");
		}
		System.out.println(sb);
	}
}