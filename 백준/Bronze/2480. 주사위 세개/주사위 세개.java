import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();

		int n = -1;
		int a = 0;
		if (arr[0] == arr[1]) {
			n = arr[0];
			a++;
		}
		if (arr[2] == arr[1]) {
			n = arr[2];
			a++;
		}
		if (arr[0] == arr[2]) {
			n = arr[0];
			a++;
		}

		int max = Math.max(arr[0], Math.max(arr[1], arr[2]));

		if (a == 0) {
			System.out.println(max * 100);
		}
		if (a == 1) {
			System.out.println(1000 + n * 100);
		}
		if (a == 3) {
			System.out.println(10000 + n * 1000);
		}

	}
}