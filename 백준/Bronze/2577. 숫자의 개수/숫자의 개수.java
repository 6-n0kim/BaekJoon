import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String[] arr = String.valueOf(a * b * c).split("");
		int arr1[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr1[Integer.parseInt(arr[i])]++;
		}
		for(int n : arr1) {
			System.out.println(n);
		}
	}
}
