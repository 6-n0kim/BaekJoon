import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String arr[][] = new String[n][m];
		boolean row[] = new boolean[n];
		boolean col[] = new boolean[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine().split("");
			for (int j = 0; j < arr[i].length; j++) {
				if (!row[i] && arr[i][j].equals("X")) {
					row[i] = true;
				}
				if (!col[j] && arr[i][j].equals("X")) {
					col[j] = true;
				}
			}
		}
		int cntR = 0;
		int cntC = 0;
		for (int i = 0; i < row.length; i++) {
			if (!row[i]) {
				cntR++;
			}
		}
		for (int i = 0; i < col.length; i++) {
			if (!col[i]) {
				cntC++;
			}
		}
		System.out.println(Math.max(cntR, cntC));
	}
}
