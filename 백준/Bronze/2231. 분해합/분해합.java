import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int rs = 0;

		for (int i = 9; i >= 0; i--) {
			if (100001 * i > n)
				continue;
			for (int j = 9; j >= 0; j--) {
				if (100001 * i + 10001 * j > n)
					continue;
				for (int k = 9; k >= 0; k--) {
					if (100001 * i + 10001 * j + 1001 * k > n)
						continue;
					for (int l = 9; l >= 0; l--) {
						if (100001 * i + 10001 * j + 1001 * k + 101 * l > n)
							continue;
						for (int h = 9; h >= 0; h--) {
							if (100001 * i + 10001 * j + 1001 * k + 101 * l + 11 * h > n)
								continue;
							for (int f = 9; f >= 0; f--) {
								if (100001 * i + 10001 * j + 1001 * k + 101 * l + 11 * h + 2 * f > n)
									continue;
								if (100001 * i + 10001 * j + 1001 * k + 101 * l + 11 * h + 2 * f == n)
									rs = 100000 * i + +10000 * j + 1000 * k + 100 * l + 10 * h + f;
							}
						}
					}
				}
			}
		}
		System.out.println(rs);
	}
}