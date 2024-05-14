import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean chk[];
	static int arr[][];
	static StringBuilder sb;
	static Queue<Integer> que;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		arr = new int[n + 1][n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arr[a][b] = arr[b][a] = 1;
		}

		chk = new boolean[n + 1];
		dfs(v);

		sb.append("\n");

		que = new LinkedList<>();
		chk = new boolean[n + 1];

		bfs(v);

		System.out.println(sb);

	}

	private static void dfs(int v) {
		sb.append(v + " ");
		chk[v] = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i][v] == 1 && !chk[i]) {
				dfs(i);
			}
		}

	}

	private static void bfs(int v) {
		sb.append(v + " ");
		chk[v] = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][v] == 1 && !chk[i]) {
				chk[i] = true;
				que.add(i);
			}
		}
		if (!que.isEmpty()) {
			bfs(que.poll());
		}
	}

}
