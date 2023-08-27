import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[][] list = new String[5][15];

		for (int i = 0; i < 5; i++) {
			String a = br.readLine();
			String[] arr = a.split("");
			for (int j = 0; j < arr.length; j++) {
				list[i][j] = arr[j];
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (list[j][i] != null) {
					sb.append(list[j][i]);
				}
			}
		}
		System.out.println(sb);
	}
}