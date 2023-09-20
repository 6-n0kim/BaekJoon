import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int testCase[] = new int[t];
		int max = 0;
		for (int i = 0; i < testCase.length; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
			if (testCase[i] > max)
				max = testCase[i];
		}

		boolean arr[] = new boolean[max + 1];

		arr[0] = arr[1] = true;
		for (int i = 2; i * i < arr.length; i++) {
			if (!arr[i]) {
				for (int j = i * i; j < arr.length; j += i) {
					arr[j] = true;
				}
			}
		}

		for (int r = 0; r < testCase.length; r++) {
			int n = testCase[r];
			int cnt = 0;
			for (int i = 2; i <= n/2; i++) {
				if (!arr[i] && !arr[n-i]) {
					cnt++;
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}
}
