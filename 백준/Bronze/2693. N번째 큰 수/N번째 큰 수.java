import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int[] arr =Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
			Arrays.sort(arr);
			System.out.println(arr[arr.length-3]);
		}
	}
}