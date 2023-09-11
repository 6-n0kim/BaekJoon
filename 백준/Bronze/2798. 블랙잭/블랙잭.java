import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int num[] = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int n = arr[0];
		int m = arr[1];
		int rs = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				for (int k = j + 1; k < num.length; k++) {
					if (num[i] + num[j] + num[k] <= m && num[i] + num[j] + num[k] > rs) {
						rs = num[i] + num[j] + num[k];
					}
				}
			}
		}
		System.out.println(rs);
	}
}