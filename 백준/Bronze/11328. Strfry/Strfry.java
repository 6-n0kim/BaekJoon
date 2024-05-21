import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			int aa[] = new int[26];
			
			for (int j = 0; j < str[0].length(); j++) {
				aa[(int)(str[0].charAt(j) - 'a')]++;
			}
			for (int j = 0; j < str[1].length(); j++) {
				aa[(int)(str[1].charAt(j) - 'a')]--;
			}

			boolean chk = true;
			for (int alp : aa) {
				if (alp != 0) {
					chk = false;
					break;
				}
			}
			if (chk) {
				System.out.println("Possible");
			}else {
				System.out.println("Impossible");
			}
		}

	}
}
