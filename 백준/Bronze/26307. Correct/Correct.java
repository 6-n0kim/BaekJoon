import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s =  br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int rs = (a-9)*60 +b;
		System.out.println(rs);
	}
}