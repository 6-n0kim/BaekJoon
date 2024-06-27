import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String arr[] = br.readLine().split(" ");
			System.out.print("Case #" + (i+1) + ": ");
			for (int j = arr.length-1; j >= 0; j--) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
}