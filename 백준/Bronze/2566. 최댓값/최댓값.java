import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] result = new int[9][9];

		int max = 0;
		int idx1 = 0;
		int idx2 = 0;

		for (int i = 0; i < 9; i++) {
			String a = br.readLine();
			String[] arr = a.split(" ");
			for (int j = 0; j < arr.length; j++) {
				int num = Integer.parseInt(arr[j]);
				result[i][j] = num;
				if (max < num) {
					max = num;
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((idx1+1) + " " + (idx2+1));
	}
}