import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]) + 1;
		int b = Integer.parseInt(arr[1]) + 1;
		int c = Integer.parseInt(arr[2]) + 1;

		int n = (int) ((double) (a * b / c - 1));
		System.out.println(n);
	}
}