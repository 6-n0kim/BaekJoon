import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int zr = Integer.parseInt(st.nextToken());
		int zc = Integer.parseInt(st.nextToken());

		for (int i = 0; i < r; i++) {
			String s = br.readLine();
			String str = "";
			
			for (int j = 0; j < s.length(); j++) {
				for (int j2 = 0; j2 < zc; j2++) {
					str += s.charAt(j);
				}
			}
			for (int j = 0; j < zr; j++) {
				System.out.println(str);	
			}
		}
	}
}
