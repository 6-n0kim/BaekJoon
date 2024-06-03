import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int L = Integer.parseInt(br.readLine());
		int sum = 1 * S + 2 * M + 3 * L;
		if (sum > 9) {
			System.out.println("happy");
		}else {
			System.out.println("sad");
		}
	}

}
