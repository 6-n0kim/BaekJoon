import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int org = n;
		int cnt = 0;
		while (true) {
			int n1;
			int n2;
			if (n/10 == 0) {
				n1 = 0;
				n2 = n;
			}else {
				n1 = n/10;
				n2 = n%10;
			}
			
			int newNum = n1+n2;
			newNum%=10;
			
			n = 10*n2 + newNum;
			cnt++;
			if (n==org) break;
		}
		System.out.println(cnt);
	}
}