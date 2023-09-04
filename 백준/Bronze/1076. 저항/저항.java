import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		String[] arr = {"black", "brown", "red", "orange", "yellow", "green",
				"blue", "violet", "grey", "white"};
		long result = (Arrays.asList(arr).indexOf(a) * 10) + Arrays.asList(arr).indexOf(b);
		result *= Math.pow(10, Arrays.asList(arr).indexOf(c));
		System.out.println(result);
	}
}
