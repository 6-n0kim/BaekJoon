import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int lessLev = 0;
		int lessTime = Integer.MAX_VALUE;
		// k = 만들 층
		for (int k = 0; k <= 256; k++) {
			int block = 0; // 인벤토리로 들어갈 블록 수
			int time = 0; // 필요한 시간
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					block += arr[i][j] - k;
					if (arr[i][j] - k > 0) {
						time += (arr[i][j] - k) * 2;
					} else if (arr[i][j] - k < 0) {
						time += Math.abs(arr[i][j] - k);
					}
				}
			}
			if (block + b < 0)
				continue;
			if (time <= lessTime) {
				lessLev = k;
				lessTime = time;
			}
		}
		System.out.println(lessTime + " " + lessLev);
	}
}