import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static String[][] board;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		board = new String[n][m];

		int max = Integer.MAX_VALUE;
		for (int i = 0; i < board.length; i++) {
			board[i] = br.readLine().split("");
		}

		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				int fn = fn(i,j);
				if (fn < max)
					max = fn;
			}
		}
		System.out.println(max);
	}

	public static int fn(int n, int m) {
		int cnt = 0;
		String s1 = "BWBWBWBW";
		String s2 = "WBWBWBWB";
		String s = s1;
		for (int i = n; i < n+8; i++) {
			int idx = 0;
			for (int j = m; j < m+8; j++) {
				if (board[i][j].charAt(0) != s.charAt(idx++)) {
					cnt++;
				}
			}
			if (s.equals(s1)) s=s2;
			else s=s1;
		}
		return Math.min(cnt, 64 - cnt);
	}
}