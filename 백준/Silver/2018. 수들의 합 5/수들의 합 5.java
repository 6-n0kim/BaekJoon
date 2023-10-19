import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int start = 0;
		while (start < n) {
			start++;
			int sum = 0;
			int start1 = start;
			while (sum < n) {
				sum += start1++;
			}
			if (sum == n) {
				cnt++;
				continue;
			}
		}
		System.out.println(cnt);
	}
}