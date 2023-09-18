import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int idx = (int) Math.round((double) n / 100 * 15);
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);
		int sum = 0;
		for (int i = 0 + idx; i < n - idx; i++) {
			sum += arr[i];
		}
		System.out.println(Math.round((double) sum / (n - idx * 2)));
	}
}
