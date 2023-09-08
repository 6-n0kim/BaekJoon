import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int cnt = 0;
		int sum = 0;
		for (int i = a; i <= b; i++) {
			int chk = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					chk++;
				}
			}
			if (chk == 1) {
				if (cnt == 0) {
					cnt = i;
				}
				sum += i;
			}
		}
		if (cnt == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(cnt);
		}
	}
}
