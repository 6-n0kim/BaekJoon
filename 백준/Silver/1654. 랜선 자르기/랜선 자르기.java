import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[k];
		long max = 0;
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (max < arr[i]) max = arr[i];
		}
		max++;
		long min = 0;
		long mid = 0;

		while (min < max) {
			int count = 0;
			mid = (max + min) / 2;
			for (int i = 0; i < arr.length; i++) {
				count += (arr[i] / mid);
			}
			if (count < n) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}
		System.out.println(min - 1);
	}
}