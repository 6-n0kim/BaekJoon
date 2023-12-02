import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("/");
		int[] arr2 = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		if (arr2[1] == 0 || arr2[0] + arr2[2] < arr2[1]) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}
}