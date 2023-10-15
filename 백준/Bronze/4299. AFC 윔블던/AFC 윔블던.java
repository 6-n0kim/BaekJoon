import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //x+y
		int m = Integer.parseInt(st.nextToken()); //x-y
		int max = (n+m)/2;
		int min = (n-m)/2;
		
		if ((max*2) == (n+m) && (min*2) == (n-m) && max > -1 && min > -1) {
			System.out.println(max +" " + min);
		}else {
			System.out.println(-1);
		}
	}
}