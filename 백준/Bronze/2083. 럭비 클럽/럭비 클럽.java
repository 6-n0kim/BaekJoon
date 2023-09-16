import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static String dp[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (name.equals("#")) {
				break;
			}
			sb.append(name + " ");
			if (a > 17 || b >= 80) {
				sb.append("Senior\n");
			} else {
				sb.append("Junior\n");
			}
		}
		System.out.println(sb);
	}
}