import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int a = n % 10;
			n /= 10;
			sum += Math.pow(a, 5);
		}
		System.out.println(sum);
	}
}