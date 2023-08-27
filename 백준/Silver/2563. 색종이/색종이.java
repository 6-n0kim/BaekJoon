import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		int[][] white = new int[101][101];

		while (t-- > 0) {
			String[] idx = br.readLine().split(" ");
			
			int num1 = Integer.parseInt(idx[0]);
			int num2 = Integer.parseInt(idx[1]);
			
			for (int i = num1; i < num1+10; i++) {
				for (int j = num2; j < num2+10; j++) {
					white[i][j]++;
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < white.length; i++) {
			for (int j = 0; j < white[i].length; j++) {
				if (white[i][j] != 0 ) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}