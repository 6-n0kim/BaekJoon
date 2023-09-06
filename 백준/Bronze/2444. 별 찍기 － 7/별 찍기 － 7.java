import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		sb.append("*");
		
		for (int i = 0; i < n; i++) {

			for (int j = n-1; j > i ; j--) {
				System.out.print(" ");
			}
			System.out.print(sb);
			sb.append("**");
			System.out.println();
		}
		int temp = n;
		for (int i = 0; i < n-1 ; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print(" ");
			}
			sb.setLength(2*--temp-1);
			System.out.println(sb);
		}
	}
}