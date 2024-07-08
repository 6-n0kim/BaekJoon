import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr);
		String b = br.readLine().replace("A", "0").replace("B", "1").replace("C", "2");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[b.charAt(i)-'0']+" ");
		}
	}
}