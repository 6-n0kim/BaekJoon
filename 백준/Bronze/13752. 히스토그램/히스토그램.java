import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int s = Integer.parseInt(br.readLine());
			for (int j = 0; j < s; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}
}