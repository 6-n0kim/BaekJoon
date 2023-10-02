import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder rs = new StringBuilder();
		String s = br.readLine();
		int start = 0;
		int end = start + n;
		int cnt = 0;
		String arr[] = new String[s.length() / n];
		while (end <= s.length()) {
			StringBuilder sb = new StringBuilder();
			cnt++;
			String str = s.substring(start, end);
			if (cnt % 2 == 0) {
				rs.append(sb.append(str).reverse());
				arr[cnt-1]= sb.toString();
			} else {
				rs.append(str);
				arr[cnt-1]= str;
			}
			start += n;
			end += n;
		}
		rs.setLength(0);
		for (int i = 0; i < arr[0].length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				rs.append(arr[j].charAt(i));
			}
		}
		System.out.println(rs);
	}
}