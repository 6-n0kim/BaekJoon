import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int[] pocket = new int[arr[0]];

		for (int i = 0; i < pocket.length; i++) {
			pocket[i] = i + 1;
		}

		for (int i = 0; i < arr[1]; i++) {
			int[] ball = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
			int temp = pocket[ball[0] - 1];
			pocket[ball[0] - 1] = pocket[ball[1] - 1];
			pocket[ball[1] - 1] = temp;
		}
		for (int k : pocket) {
			System.out.print(k + " ");
		}

	}
}
