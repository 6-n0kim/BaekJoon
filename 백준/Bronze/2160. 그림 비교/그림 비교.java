import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][][] arr = new String[n][5][7];
		int chk[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = br.readLine().split("");
			}
		}

		for (int i = 0; i < chk.length - 1; i++) {
			for (int j = i + 1; j < chk.length; j++) {
				if (chk[i][j] == 0) {
					int cnt = 0;
					for (int k = 0; k < 5; k++) {
						for (int k2 = 0; k2 < 7; k2++) {
							if (!arr[i][k][k2].equals(arr[j][k][k2])) {
								cnt++;
							}
						}
					}
					chk[j][i] = chk[i][j] = cnt;
				}
			}
		}

		int min = 36;
		int a = 0;
		int b = 0;
		for (int i = 0; i < chk.length - 1; i++) {
			for (int j = i + 1; j < chk.length; j++) {
				if (chk[i][j] < min) {
					min = chk[i][j];
					a = i + 1;
					b = j + 1;
				}
			}
		}
		System.out.println(a + " " + b);
	}
}
