import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String temp = "";
			for (int j = 0; j < m; j++) {
				char a = s.charAt(j);
				temp += a;
				temp += a;
			}
			arr[i] = temp;
		}
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if (!arr[i].equals(str)) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Not Eyfa");
		}else {
			System.out.println("Eyfa");
		}
	}
}