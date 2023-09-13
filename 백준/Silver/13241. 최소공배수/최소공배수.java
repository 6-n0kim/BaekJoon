import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long min = Math.min(a, b);
		long mul = 1;
		while (true) {
			if (min * mul % a == 0 && min * mul % b == 0) {
				break;
			} else {
				mul++;
			}
		}
		System.out.println(min * mul);
	}
}