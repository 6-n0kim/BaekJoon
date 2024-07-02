import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		int n = 0;
		if (a.charAt(0) < 65) {
			n = Integer.parseInt(a) + 3;
		}else if (b.charAt(0) < 65) {
			n = Integer.parseInt(b) + 2;
		}else if (c.charAt(0) < 65) {
			n = Integer.parseInt(c) + 1;
		}
		if (n % 3 == 0) {
			if (n % 5 == 0) {
				System.out.println("FizzBuzz");
			}else {
				System.out.println("Fizz");
			}
		}else if (n % 5 == 0) {
			System.out.println("Buzz");
		}else {
			System.out.println(n);
		}
	}
}