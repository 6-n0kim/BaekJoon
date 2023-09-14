import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		List<String> list = new ArrayList<>();
		list.add("Never gonna give you up");
		list.add("Never gonna let you down");
		list.add("Never gonna run around and desert you");
		list.add("Never gonna make you cry");
		list.add("Never gonna say goodbye");
		list.add("Never gonna tell a lie and hurt you");
		list.add("Never gonna stop");
		int a = Integer.parseInt(br.readLine());
		boolean b=true;
		for (int i = 0; i < a; i++) {
			if (!list.contains(br.readLine())) {
				b=false;
			}
		}
		System.out.println(b?"No":"Yes");
	}
}