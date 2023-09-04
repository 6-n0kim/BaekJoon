import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int T = in.nextInt();

		while (T-- > 0) {
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int r1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int r2 = in.nextInt();
			int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

			if (x1 == x2 && y1 == y2 && r1 == r2) {
				sb.append(-1).append("\n");
			} else if (distance > Math.pow(r1 + r2, 2)) {
				sb.append(0).append("\n");
			} else if (distance < Math.pow(r2 - r1, 2)) {
				sb.append(0).append("\n");
			} else if (distance == Math.pow(r2 - r1, 2)) {
				sb.append(1).append("\n");
			} else if (distance == Math.pow(r1 + r2, 2)) {
				sb.append(1).append("\n");
			} else {
				sb.append(2).append("\n");
			}
		}
		System.out.println(sb);
	}
}