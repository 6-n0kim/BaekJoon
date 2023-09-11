import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static int[] arr = new int[500000];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
	    long a = 0;
		long sum = 0;
		for (int i = 1; i <= n - 2; i++) {
			a+=i;
			sum+=a;
		}
		System.out.println(sum);
		System.out.println(3);
	}
}