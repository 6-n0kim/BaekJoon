import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			que.offer(i);
		}
		while(true) {
			int a = que.poll();
			sb.append(a +" ");
			if (que.isEmpty()) {
				break;
			}
			int b = que.poll();
			que.offer(b);
		}
		System.out.println(sb);
	}
}