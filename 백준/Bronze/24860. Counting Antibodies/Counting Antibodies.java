import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		long a1 = Long.parseLong(st.nextToken());
		long a2 = Long.parseLong(st.nextToken());

		st = new StringTokenizer(br.readLine());
		long b1 = Long.parseLong(st.nextToken());
		long b2 = Long.parseLong(st.nextToken());

		st = new StringTokenizer(br.readLine());
		long c1 = Long.parseLong(st.nextToken());
		long c2 = Long.parseLong(st.nextToken());
		long c3 = Long.parseLong(st.nextToken());

		long tot = (c1 * c2 * c3) * ((a1 * a2) + (b1 * b2));

		System.out.print(tot);
	}
}