import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		if (n > 2) {
			System.out.println("After");
		} else if (n == 2) {
			if (m == 18) {
				System.out.println("Special");
			} else if (m < 18) {
				System.out.println("Before");
			} else if (m > 18) {
				System.out.println("After");
			}
		} else {
			System.out.println("Before");
		}
	}
}