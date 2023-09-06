import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double sum = 0;
		double cnt = 0;

		for (int i = 0; i < 20; i++) {
			String[] arr = br.readLine().split(" ");
			double d = Double.parseDouble(arr[1]);
			double d2 = 0;
			String s = arr[2];
			if (s.equals("A+")) {
				d2 = 4.5;
				cnt += d;
			}
			if (s.equals("A0")) {
				d2 = 4.0;
				cnt += d;
			}
			if (s.equals("B+")) {
				d2 = 3.5;
				cnt += d;
			}
			if (s.equals("B0")) {
				d2 = 3.0;
				cnt += d;
			}
			if (s.equals("C+")) {
				d2 = 2.5;
				cnt += d;
			}
			if (s.equals("C0")) {
				d2 = 2.0;
				cnt += d;
			}
			if (s.equals("D+")) {
				d2 = 1.5;
				cnt += d;
			}
			if (s.equals("D0")) {
				d2 = 1.0;
				cnt += d;
			}
			if (s.equals("F")) {
				d2 = 0;
				cnt += d;
			}
			if (s.equals("P")) {

			}
			sum += (d * d2);
		}
		System.out.printf("%.6f", sum / cnt);
	}
}