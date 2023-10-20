import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[]= new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr); 
		System.out.println(cal(arr));
	}

	private static int cal(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i] *(arr.length-i));
		}
		return sum;
	}
}