import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int arr[] = new int[n];
		int start = 0;
		
		arr[start]++;
		
		while (arr[start] < m) {
			
			if (arr[start] % 2 == 0) {
				start -= l;
			} else {
				start += l;
			}

			if (start < 0) {
				start += n;
			} else if (start >= n) {
				start -= n;
			}
			arr[start]++;
			cnt++;
		}

		System.out.println(cnt);
	}
}