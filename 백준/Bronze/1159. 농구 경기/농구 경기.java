import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[26];
		for (int i = 0; i < n; i++) {
			char s = br.readLine().charAt(0);
			arr[s - 'a']++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 4) {
				char c = (char) (i +'a');
				sb.append(c);
			}
		}
		if (sb.length()== 0) {
			sb.append("PREDAJA");
		}
		System.out.println(sb);
	}
}