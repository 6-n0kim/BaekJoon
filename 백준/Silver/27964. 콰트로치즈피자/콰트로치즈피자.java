import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String s = st.nextToken().replace("Cheese", "-");
			if (s.charAt(s.length() - 1) == '-' && !list.contains(s)) {
				list.add(s);
			}
		}
		System.out.println(list.size() >= 4 ? "yummy" : "sad");
	}
}
