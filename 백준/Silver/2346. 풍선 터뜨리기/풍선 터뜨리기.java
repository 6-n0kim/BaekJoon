import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		Deque<int[]> que = new ArrayDeque<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i < arr.length; i++) {
			que.add(new int[] { i + 1, arr[i] });
		}
		
		sb.append("1 ");
		int go = arr[0];
		
		while(!que.isEmpty()) {
			int[] x;
			if (go > 0) {
				for (int i = 1; i < go; i++) {
					que.addLast(que.pollFirst());
				}
				x = que.pollFirst();
				go = x[1];
			}
			else {
				for (int i = 1; i < -go; i++) {
					que.addFirst(que.pollLast());
				}
				x = que.pollLast();
				go = x[1];
			}
			
			sb.append(x[0]+ " ");
		}
		System.out.println(sb);
	}
}