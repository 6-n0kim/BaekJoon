import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		while(a>1) {
			for (int i = 2; i <= a; i++) {
				if (a % i==0) {
					a/=i;
					System.out.println(i);
					break;
				}
			}
		}
	}
}