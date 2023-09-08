import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = 1;
		int cnt = 1;
		int i = 0;
		while(true) {
			if (n > max) {
				i++;
				max+=6*i;
				cnt++;
			}
			else if (n <= max) {
				break;
			}
		}
		System.out.println(cnt);
	}
}