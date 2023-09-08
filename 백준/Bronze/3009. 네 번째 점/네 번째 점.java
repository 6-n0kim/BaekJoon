import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st1.nextToken());
		int y2 = Integer.parseInt(st1.nextToken());
		int x3 = Integer.parseInt(st2.nextToken());
		int y3 = Integer.parseInt(st2.nextToken());
		int x =0;
		int y=0;
		
		if (x1 == x2) {
			x = x3;
		}else if (x2 == x3) {
			x = x1;
		}else {
			x = x2;
		}
		if (y1 == y2) {
			y = y3;
		}else if (y2 == y3) {
			y = y1;
		}else {
			y = y2;
		}
		System.out.println(x +" " + y);
	}
}
