import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split(" ");
		String arr2[] = br.readLine().split(" ");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(arr[i]);
			int b = Integer.parseInt(arr2[i]);

			if (a < b) {
				sum += b - a;
			}
		}
		System.out.println(sum);
	}

}
