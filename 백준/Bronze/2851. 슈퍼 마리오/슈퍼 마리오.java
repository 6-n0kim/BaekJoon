import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			if (Math.abs(100 -(sum + n)) <= Math.abs(100 - sum)) {
				sum += n;
			}else break;
		}
		System.out.println(sum);
	}
}