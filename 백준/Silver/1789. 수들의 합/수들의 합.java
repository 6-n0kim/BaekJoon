import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long s = Long.parseLong(br.readLine());
		long i = 1;
		while (s >= i) {
			s -= i;
			i++;
		}
		System.out.println(i-1);
	}
}