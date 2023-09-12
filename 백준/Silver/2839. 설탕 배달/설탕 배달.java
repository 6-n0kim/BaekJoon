import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int tot = Integer.MAX_VALUE;
		for (int i = 0; i <= 1000; i++) {
			if (i * 5 > n)
				continue;
			for (int j = 0; j <= 1667; j++) {
				if (i * 5 + j * 3 > n)
					continue;
				if (i * 5 + j * 3 == n && i + j < tot)
					tot = i + j;
			}
		}
		if (tot == Integer.MAX_VALUE)
			tot = -1;

		System.out.println(tot);
	}
}