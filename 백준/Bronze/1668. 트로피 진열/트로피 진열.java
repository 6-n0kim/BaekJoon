import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int left = 0, right = 0, max = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] > max) {
				max = arr[i];
				left++;
			}
		}
		max = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				right++;
			}
		}
		System.out.println(left);
		System.out.println(right);
	}
}