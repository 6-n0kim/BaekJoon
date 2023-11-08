import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = Integer.parseInt(br.readLine());
			sum +=  n < 40 ? 40 : n;
		}
		System.out.println(sum / 5);
	}
}