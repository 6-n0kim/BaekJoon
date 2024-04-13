import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		
		int n = s.length()/2;
		int m = 0;
		for (int i = 0; i < n; i++) {
			m+= s.charAt(i);
		}
		for (int i = n; i < s.length(); i++) {
			m-= s.charAt(i);
		}
		if (m==0) {
			System.out.println("LUCKY");
		}else {
			System.out.println("READY");
		}
	}
}
