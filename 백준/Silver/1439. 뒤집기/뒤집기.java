import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char[] arr = s.toCharArray();

		int cnt0 = 0;
		int cnt1 = 0;
		boolean chk0 = true;
		boolean chk1 = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0' && chk0) {
				cnt0++;
				chk0 = false;
				chk1 = true;
			} else if (arr[i] == '1' && chk1) {
				cnt1++;
				chk1 = false;
				chk0 = true;
			}
		}
		System.out.println(Math.min(cnt0, cnt1));
	}
}