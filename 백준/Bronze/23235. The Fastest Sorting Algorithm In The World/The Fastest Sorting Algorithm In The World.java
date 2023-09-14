import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		while (true) {
			if (br.readLine().equals("0")) {
				break;
			} else {
				System.out.println("Case " + ++i + ": Sorting... done!");
			}
		}
	}
}