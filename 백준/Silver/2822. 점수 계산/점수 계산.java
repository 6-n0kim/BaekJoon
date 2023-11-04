import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int arr[] = new int[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int arr2[] = arr.clone();
		int arr3[] = new int [5];
		Arrays.sort(arr);
		int sum = 0;
		int idx = 0;
		for (int i = arr.length - 1; i > arr.length - 6; i--) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr[i] == arr2[j]) {
					arr3[idx++] = j+1;
					sum += arr2[j];
				}
			}
		}
		Arrays.sort(arr3);
		for (int i = 0; i < arr3.length; i++) {
			sb.append(arr3[i]+ " ");
		}
		System.out.println(sum);
		System.out.println(sb);
	}
}