import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		boolean arr[] = new boolean[5];
		for (int i = 0; i < n.length(); i++) {
			char a = n.charAt(i);
			if (a == 'M') {
				arr[0] = true;
			}
			if (a == 'O') {
				arr[1] = true;
			}
			if (a == 'B') {
				arr[2] = true;
			}
			if (a == 'I') {
				arr[3] = true;
			}
			if (a == 'S') {
				arr[4] = true;
			}
		}
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]) {
				cnt++;
			}
		}
		if (cnt == 5) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}