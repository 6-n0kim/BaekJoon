import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = 0;
		while(n>0) {
			if(n % 5 == 0) {
				break;
			}
			n-=2;
			m++;
		}
		if (n < 0) {
			System.out.println(-1);
		}else {
			m +=n/5;
			System.out.println(m);
		}
	}
}