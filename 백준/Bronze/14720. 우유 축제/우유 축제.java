import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		String s = "딸";
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (s.equals("딸") && arr[i] == 0) {
				cnt++;
				s = "초";
			} else if (s.equals("초") && arr[i] == 1) {
				cnt++;
				s = "바";
			} else if (s.equals("바") && arr[i] == 2) {
				cnt++;
				s = "딸";
			}
		}
		System.out.println(cnt);

	}
}