import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean arr[] = new boolean[123456 * 2 + 1];
		
		arr[0] = arr[1] = true;
		for (int i = 2; i * i < arr.length; i++) {
			if (!arr[i]) {
				for (int j = i * i; j < arr.length; j += i) {
					arr[j] = true;
				}
			}
		}
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			int cnt = 0;
			for (int i = n+1; i <= 2*n; i++) {
				if (!arr[i]) cnt++;
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}
}