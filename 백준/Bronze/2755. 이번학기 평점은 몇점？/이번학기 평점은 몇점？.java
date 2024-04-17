import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		double sum = 0;
		int b = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			double a = Integer.parseInt(st.nextToken());
			b+=a;
			String s = st.nextToken();
			if (s.equals("A+")) {
				a *= 4.3;
			} else if (s.equals("A0")) {
				a *= 4;
			} else if (s.equals("A-")) {
				a *= 3.7;
			} else if (s.equals("B+")) {
				a *= 3.3;
			} else if (s.equals("B0")) {
				a *= 3;
			} else if (s.equals("B-")) {
				a *= 2.7;
			} else if (s.equals("C+")) {
				a *= 2.3;
			} else if (s.equals("C0")) {
				a *= 2;
			} else if (s.equals("C-")) {
				a *= 1.7;
			} else if (s.equals("D+")) {
				a *= 1.3;
			} else if (s.equals("D0")) {
				a *= 1;
			} else if (s.equals("D-")) {
				a *= 0.7;
			} else if (s.equals("F")) {
				a *= 0;
			}
			sum+=a;
		}
		System.out.printf("%.2f" , sum/b);
	}
}
