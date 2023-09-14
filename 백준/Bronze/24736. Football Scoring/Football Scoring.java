import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr []=Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int arr2 []=Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		
		System.out.print(arr[0] * 6 + arr[1] * 3 + arr[2] * 2 + arr[3] + arr[4] * 2 +" ");
		System.out.print(arr2[0] * 6 + arr2[1] * 3 + arr2[2] * 2 + arr2[3] + arr2[4] * 2);
	}
}