import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		int c = a * b1 + b * a1;
		int d = b * b1;
		int x = fn(c,d);
		
		System.out.println(c/x + " " + d/x);
	}

	private static int fn(int a, int b) {
		 while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	}
}