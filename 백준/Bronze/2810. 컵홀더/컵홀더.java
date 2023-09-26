import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String s = br.readLine().replace("S", "*S*").replace("LL", "*LL*").replace("**", "*");
		boolean arr[] = new boolean[s.length()];
		int cnt = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == 'S' && arr[i - 1] == false) {
				cnt++;
				arr[i - 1] = true;
			} else if (s.charAt(i) == 'S' && arr[i - 1] == true && arr[i + 1] == false) {
				cnt++;
				arr[i + 1] = true;
			} else if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && arr[i - 1] == false) {
				cnt++;
				arr[i - 1] = true;
			} else if (s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && arr[i + 1] == false) {
				cnt++;
				arr[i + 1] = true;
			}
		}
		System.out.println(cnt);
	}
}
