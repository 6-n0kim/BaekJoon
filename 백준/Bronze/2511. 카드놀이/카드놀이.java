import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split(" ");
		String arr2[] = br.readLine().split(" ");
		int As = 0;
		int Bs = 0;
		int chk = -1;
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(arr[i]);
			int b = Integer.parseInt(arr2[i]);

			if (a > b) {
				As += 3;
				chk = 1;
			} else if (a < b) {
				Bs += 3;
				chk = 0;
			} else {
				As += 1;
				Bs += 1;
			}
		}
		System.out.println(As + " " + Bs);
		if (As > Bs) {
			System.out.println("A");
		} else if (As < Bs) {
			System.out.println("B");
		} else {
			if (chk == 1) {
				System.out.println("A");
			} else if (chk == 0) {
				System.out.println("B");
			} else {
				System.out.println("D");
			}
		}
	}
}
