import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a  = Integer.parseInt(br.readLine());
		int[] arr = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr);
		System.out.println(arr[0]*arr[arr.length-1]);;
	}
}
