import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr [] =  Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
		int min = Math.min(arr[0], Math.min(arr[1], arr[2]));
		System.out.println(arr[0]+arr[1]+arr[2]-max-min);
		
	}
}