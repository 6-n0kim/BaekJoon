import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

		public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int day = (arr[2]-arr[1])/(arr[0]-arr[1]);
		if ((arr[2]-arr[1])%(arr[0]-arr[1]) == 0) {
			System.out.println(day);
		}else {
			System.out.println(day+1);
		}
	}
}