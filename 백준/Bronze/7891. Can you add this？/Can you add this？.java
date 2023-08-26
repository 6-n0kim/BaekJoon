import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			sb.append(a + b).append("\n");
		}
		System.out.println(sb);
	}
}