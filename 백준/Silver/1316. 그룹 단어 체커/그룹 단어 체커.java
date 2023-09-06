import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int rs = 0;
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			String str = br.readLine();
			String[] arr = str.split("");

			for (int j = 0; j < arr.length; j++) {
				if (sb.indexOf(arr[j]) == -1 || sb.lastIndexOf(arr[j]) == sb.length()-1) {
					sb.append(arr[j]);
				}
			}
			if (sb.toString().equals(str)) {
				rs++;
			}
		}
		System.out.println(rs);
	}
}