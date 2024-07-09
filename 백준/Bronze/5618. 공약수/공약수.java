import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (min >= arr[i]) {
				min = arr[i];
			}
		}
		for (int i = 1; i <= min; i++) {
			int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % i == 0) {
					cnt++;
				}
				if (cnt == arr.length) {
					System.out.println(i);
				}
			}
		}
	}
}