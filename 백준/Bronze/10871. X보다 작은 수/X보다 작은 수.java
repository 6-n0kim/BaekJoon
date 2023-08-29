import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String []arr = br.readLine().split(" ");
		String []arr2 = br.readLine().split(" ");
		for (int i = 0; i < arr2.length; i++) {
			if (Integer.parseInt(arr[1])>Integer.parseInt(arr2[i])) {
				System.out.print(arr2[i] + " ");
			}
		}
	}
}