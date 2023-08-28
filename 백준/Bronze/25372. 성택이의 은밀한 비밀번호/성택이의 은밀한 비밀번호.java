import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String pw = br.readLine();
			if (6<=pw.length()&& pw.length()<=9) {
				sb.append("yes\n");
			}else {
				sb.append("no\n");
			}
		}
		System.out.println(sb);
	}
}