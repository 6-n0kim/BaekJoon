import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int q = n/25;
			n -= q*25;
			int d = n/10;
			n -= d*10;
			int ni = n/5;
			n -= ni*5;
			int p = n/1;
			System.out.println(q + " " + d+ " " +ni+ " " +p);
		}
	}
}
