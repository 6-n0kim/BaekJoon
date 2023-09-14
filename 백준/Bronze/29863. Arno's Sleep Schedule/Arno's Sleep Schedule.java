import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int n = 0;
		if(a<b) {
			n =b-a;
		}else {
			n= 24-(a-b);
		}
		System.out.println(n);
	}
}