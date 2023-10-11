import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int arr[] = new int[10];
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - '0';
			if (idx == 9) {
				idx = 6;
			}
			arr[idx]++;
			if (idx == 6) {
				if (max < ((arr[idx] + 1) / 2)) {
					max = ((arr[idx] + 1) / 2);
				}
			} else if (max < arr[idx]) {
				max = arr[idx];
			}
		}
		System.out.println(max);
	}
}
