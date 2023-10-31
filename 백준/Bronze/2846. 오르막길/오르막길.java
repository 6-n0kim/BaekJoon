import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		boolean go = true;
		int start = 0;
		int end = 0;
		int max = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				if (go) {
					start = arr[i - 1];
					go = false;
				}
				end = arr[i];
			} else {
				go = true;
				start = 0;
				end = 0;
			}
			if (max < end - start) {
				max = end - start;
			}
		}
		System.out.println(max);

	}
}