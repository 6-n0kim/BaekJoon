import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		String s[] = br.readLine().split(",");
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
			sb.append(arr[i] + ",");
		}

		for (int i = 0; i < k; i++) {
			sb.setLength(0);
			int arr2[] = new int[arr.length-1];
			for (int j = 0; j < arr2.length; j++) {
				arr2[j] = arr[j + 1] - arr[j];
				sb.append(arr2[j] + ",");
			}
			arr = arr2;
		}
		sb.setLength(sb.length() - 1);
		System.out.println(sb);
	}
}
