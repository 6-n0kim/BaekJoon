import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
		}
		
		int max = 0;
		int cnt = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			if (max < arr[i]) {
				max = arr[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}