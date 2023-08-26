import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int x = Integer.parseInt(br.readLine());

		int cnt = 0;
		int stick = 64;

		while (x > 0) {
			if (stick > x) {
				stick /= 2;
			} else {
				cnt++;
				x -= stick;
			}
		}
		System.out.println(cnt);
	}
}