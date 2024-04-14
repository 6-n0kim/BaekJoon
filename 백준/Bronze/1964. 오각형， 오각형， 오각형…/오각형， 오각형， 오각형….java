import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long sum = 5;
		long add = 7;
		for (int i = 1; i < n; i++) {
			sum += add;
			add += 3;
		}
		System.out.println(sum % 45678);
	}
}
