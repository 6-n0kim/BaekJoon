import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int x = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < x; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num ==0) {
				stack.pop();
			}else {
				stack.add(num);
			}
		}
		int sum = stack.stream().mapToInt(i->i).sum();
		
		System.out.println(sum);
		
	}
}