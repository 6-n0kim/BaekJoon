import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				break;
			}

			String[] arr = new String[n];
			String[] arr1 = new String[n];

			for(int i =0; i< n; i++) {
				arr[i] = br.readLine();
				arr1[i] = arr[i].toLowerCase();
			}
			Arrays.sort(arr1);
			for(int i = 0; i < n; i++) {
				if(arr[i].toLowerCase().equals(arr1[0])) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
