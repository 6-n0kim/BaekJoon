import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append(n / 300 + " ");
		n %= 300;
		sb.append(n / 60 + " ");
		n %= 60;
		sb.append(n / 10 + " ");
		n %= 10;
		System.out.println(n == 0 ? sb : -1);
	}
}
