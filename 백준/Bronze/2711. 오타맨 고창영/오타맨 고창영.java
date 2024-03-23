import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tc = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < tc; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int wrongNum = Integer.parseInt(st.nextToken());
			String stmt = st.nextToken();
			sb.append(stmt);
			sb.deleteCharAt(wrongNum-1);
			System.out.println(sb.toString());
			sb.delete(0, sb.length());
		}
	}
}
