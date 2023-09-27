import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				String s = br.readLine();
				if (s == null) {
					break;
				}
				StringTokenizer st = new StringTokenizer(s);
				int n = Integer.parseInt(st.nextToken());
				int k = Integer.parseInt(st.nextToken());
				int chicken = n;
				while (true) {
					int new_chicken = chicken / k;
					int rest_chicken = chicken % k;
					chicken = new_chicken + rest_chicken;
					n += new_chicken;
					if (new_chicken + rest_chicken >= k) {
						continue;
					} else {
						break;
					}
				}
				System.out.println(n);
			}
		} catch (IOException e) {
		}
	}
}