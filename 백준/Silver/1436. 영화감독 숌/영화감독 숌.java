import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		long rs = 666;
		while(true) {
			if(String.valueOf(rs).indexOf("666") >-1)cnt++;
			if(cnt==n)break;
			else rs++;
		}
		System.out.println(rs);
	}
}