import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 1; i*i <= t; i++) {
			cnt++;
		}
		System.out.println(cnt);
	}
}
