import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ball = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int[] b = new int[ball[0]];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ball[1]; i++) {
			int[] arr = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
			for (int j = arr[0]; j <= arr[1]; j++) {
				b[j-1] = arr[2];
			}
		}
		for (int i : b) {
			sb.append(i + " ");
		}
		System.out.println(sb);
	}
}