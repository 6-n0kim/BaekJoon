import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3];
		arr[0] = Integer.parseInt(br.readLine());
		arr[1] = Integer.parseInt(br.readLine());
		arr[2] = Integer.parseInt(br.readLine());
		for (int i = 0; i < 3; i++) {
			if (arr[i] != Math.max(arr[0], Math.max(arr[1], arr[2]))
					&& arr[i] != Math.min(arr[0], Math.min(arr[1], arr[2]))) {
				System.out.println(arr[i]);
			}
		}
	}
}