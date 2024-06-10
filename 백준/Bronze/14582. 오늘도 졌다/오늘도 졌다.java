import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");

		int score = 0;
		for (int i = 0; i < arr.length; i++) {
			score += Integer.parseInt(arr[i]);
			if (score > 0) {
				System.out.println("Yes");
				return;
			}
			score -= Integer.parseInt(arr2[i]);
		}
		System.out.println("No");
	}
}
