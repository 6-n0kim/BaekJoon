import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[][] arr = new int[n + 1][n + 1]; 
		boolean[] chk = new boolean[n + 1]; 
		chk[1] = true;

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arr[a][b] = arr[b][a] = 1;

		}

		for (int i = 2; i <= n; i++) { 
			if (arr[1][i] == 1 && !chk[i]) {
				infect(arr, chk, i);
			}
		}

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (chk[i]) {
				count++;
			}
		}

		System.out.println(count - 1);
	}

	static void infect(int[][] arr, boolean[] chk, int start) {
		chk[start] = true;
		for (int i = 1; i < arr[start].length; i++) {
			if (arr[start][i] == 1 && !chk[i]) {
				infect(arr, chk, i);
			}
		}
	}
}