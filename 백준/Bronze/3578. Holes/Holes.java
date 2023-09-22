import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int h = Integer.parseInt(br.readLine());
		if (h == 0) {
			h = 0;
			sb.append("1");
		} else if (h == 1) {
			h = 0;
			sb.append("0");
		} else if (h % 2 == 0) {
			h /= 2;
		} else if (h % 2 != 0) {
			h = (h - 1) / 2;
			sb.append("4");
		}
		for (int i = 0; i < h; i++) {
			sb.append("8");
		}
		System.out.println(sb);
	}
}