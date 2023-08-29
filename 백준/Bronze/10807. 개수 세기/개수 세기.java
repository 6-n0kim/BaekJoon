import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String [] s = br.readLine().split(" ");
		String v = br.readLine();
		int cnt = 0;
		for(String str : s) {
			if(str.equals(v)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}