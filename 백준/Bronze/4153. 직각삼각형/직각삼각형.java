import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(true) {
			 st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int max = Math.max(a, Math.max(c, b));
			int min = Math.min(a, Math.min(c, b));
			int mid = a+b+c-max-min;
			if (max == 0) {
				break;
			}else if (Math.pow(max, 2) == Math.pow(mid, 2) + Math.pow(min, 2)){
				sb.append("right").append("\n");
			}else {
				sb.append("wrong").append("\n");
			}
		}
		System.out.println(sb);
	}
}