import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		long b = Long.parseLong(br.readLine());
		long c = Long.parseLong(br.readLine());
		long d = Long.parseLong(br.readLine());
		long p = Long.parseLong(br.readLine());
		long y = b;
		if (p > c)
			y = b + (p - c) * d;

		if (a * p < y)
			y = a * p;
		
		System.out.println(y);
	}
}
