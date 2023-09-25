import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			br.readLine();
			br.readLine(); // 공백
			int s[] = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
			int b[] = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
			Arrays.sort(s);
			Arrays.sort(b);
			int sMax = s[s.length - 1];
			int bMax = b[b.length - 1];
			if (sMax >= bMax) {
				sb.append("S\n");
			} else if (sMax < bMax) {
				sb.append("B\n");
			}
		}
		System.out.println(sb);
	}
}