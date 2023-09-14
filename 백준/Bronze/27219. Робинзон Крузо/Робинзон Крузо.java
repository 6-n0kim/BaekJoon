import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = a / 5;
		int c = a % 5;
		for (int i = 0; i < b; i++) {
			System.out.print("V");
		}
		for (int i = 0; i < c; i++) {
			System.out.print("I");
		}
	}
}