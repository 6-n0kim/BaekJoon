import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String[] arr = br.readLine().split(" ");
			int h = Integer.parseInt(arr[0]);
			int n = Integer.parseInt(arr[2]);

			int a =0;
			int b =0;
			if (n%h == 0) {
				a = h*100;
				b = n/h;
			}else {
				a = n%h*100;
				b = n/h+1;
			}
			System.out.println(a+b);
		}
	}
}
