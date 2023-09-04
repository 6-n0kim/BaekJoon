import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tot = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			int[] arr = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
			tot -= arr[0] * arr[1];
		}
		if (tot == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}