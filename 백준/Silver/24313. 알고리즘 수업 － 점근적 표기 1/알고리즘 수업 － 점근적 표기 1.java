import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int x = arr[0];
		int y = arr[1];
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		if ((a - x) * b - y >= 0 && a >= x) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}