import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());br.close();
		int cnt = 0;
		for (int i = 1; i*i <= t; i++) {
			cnt++;
		}
		System.out.println(cnt);
	}
}
