import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list  = new ArrayList<>();
		for (int i = 1; i <= 10000; i++) {
			String s = String.valueOf(i);
			int n = i;
			for (int j = 0; j < s.length(); j++) {
				n += s.charAt(j) - '0';
			}
			list.add(n);
		}
		for (int i = 1; i <= 10000; i++) {
			if (!list.contains(i)) {
				System.out.println(i);
			}
		}
	}
}