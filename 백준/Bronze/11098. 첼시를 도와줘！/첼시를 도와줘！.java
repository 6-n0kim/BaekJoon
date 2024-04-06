import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int max = 0;
			String name = "";
			for (int j = 0; j < p; j++) {
				st = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st.nextToken());
				String s = st.nextToken();
				if (c>max) {
					max = c;
					name = s;
				}
			}
			sb.append(name+"\n");
		}
		System.out.println(sb);
	}
}
