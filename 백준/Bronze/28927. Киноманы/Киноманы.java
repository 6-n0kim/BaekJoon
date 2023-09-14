import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken())*3 + Integer.parseInt(st.nextToken())*20 +Integer.parseInt(st.nextToken())*120;
		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken())*3 + Integer.parseInt(st.nextToken())*20 +Integer.parseInt(st.nextToken())*120;
		
		if (a>b) {
			System.out.println("Max");
		}else if (a<b) {
			System.out.println("Mel");
		}else {
			System.out.println("Draw");
		}
	}
}