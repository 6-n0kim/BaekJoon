import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine())%42;
			if (!list.contains(n)) {
				list.add(n);
			}
		}
		System.out.println(list.size());
	}
}
