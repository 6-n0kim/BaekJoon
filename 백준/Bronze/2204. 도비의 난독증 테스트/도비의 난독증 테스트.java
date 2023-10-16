import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			List<String> list = new ArrayList<>();
			String[] arr = new String[n];
			for (int i = 0; i < n; i++) {
				String s = br.readLine();
				arr[i] = s;
				list.add(s.toLowerCase());
				Collections.sort(list);
			}
			String s1 = "";
			for (String s : list) {
				s1 = s;
				break;
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].toLowerCase().equals(s1)) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
