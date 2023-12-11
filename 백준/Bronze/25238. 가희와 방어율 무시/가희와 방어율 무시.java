import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = 100 - Integer.parseInt(st.nextToken());

		if (n * m / 100 >= 100) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
	}
}