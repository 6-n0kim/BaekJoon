import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			long x = 0;
			long y = 0;
			x = Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
			y = Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
			if (x > y) {
				System.out.println("TelecomParisTech");
			} else if (x == y) {
				System.out.println("Tie");
			} else {
				System.out.println("Eurecom");
			}
		}
		
	}
}