
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	
		String s = sb.append(br.readLine()).reverse().toString();
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			int a = (s.charAt(i) - '0');
			if (a > 4)
				a -= 1;
			cnt +=Math.pow(9, i)*a;
		}
		System.out.println(cnt);
	}
}