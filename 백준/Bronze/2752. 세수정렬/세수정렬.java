import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr [] =  Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}