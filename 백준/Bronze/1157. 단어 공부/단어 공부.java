import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toUpperCase();
		int []arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			 arr[s.charAt(i)-'A']++;
		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}