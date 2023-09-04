import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] chess = new String[8][8];

		for (int j = 0; j < chess.length; j++) {
			String[] a = br.readLine().split("");
			chess[j] = a;
		}

		int sum = 0;
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess[i].length; j++) {
				if ((i + j) % 2 == 0 && chess[i][j].equals("F")) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}
