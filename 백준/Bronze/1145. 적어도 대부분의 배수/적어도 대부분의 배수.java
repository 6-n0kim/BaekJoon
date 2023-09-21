import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int rs = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int j2 = j + 1; j2 < arr.length; j2++) {
					int lcm = fn(arr[i], arr[j], arr[j2]);
					if (lcm < rs) {
						rs = lcm;
					}
				}
			}
		}
		System.out.println(rs);
	}

	private static int fn(int n1, int n2, int n3) {
		int gcd1 = gcd(n1, n2);
		int lcm1 = (n1 * n2) / gcd1;
		int gcd2 = gcd(lcm1, n3);
		int lcm = lcm1 * n3 / gcd2;
		return lcm;
	}

	private static int gcd(int n1, int n2) {
		int max = Math.max(n1, n2);
		int min = Math.min(n1, n2);

		if (max % min == 0) {
			return min;
		} else {
			return gcd(min, max % min);
		}
	}
}
