import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		for (int i = 0; i < 6; i++) {
			String s = br.readLine();
			if (s.equals("W")) {
				cnt++;
			}
		}

		if (cnt == 1 || cnt == 2) {
			System.out.println(3);
		} else if (cnt == 3 || cnt == 4) {
			System.out.println(2);
		} else if (cnt == 5 || cnt == 6) {
			System.out.println(1);
		} else {
			System.out.println(-1);
		}
	}
}
