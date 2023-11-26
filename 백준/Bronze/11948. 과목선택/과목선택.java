import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int n = Integer.parseInt(br.readLine());
		int n1 = Integer.parseInt(br.readLine());
		System.out.println(arr[3] + arr[2] + arr[1] + Math.max(n, n1));
	}
}