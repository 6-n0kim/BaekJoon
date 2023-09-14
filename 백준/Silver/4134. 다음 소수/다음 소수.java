import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(br.readLine());
			if(a == 0 || a == 1 || a == 2)
            {
                sb.append("2\n");
                continue;
            }

			while (true) {
				int cnt = 0;
				for (int j = 2; j <= Math.sqrt((double)a); j++) {
					if (a % j == 0) {
						cnt++;
						break;
					}
				}
				if (cnt == 0) {
					sb.append(a + "\n");
					break;
				}
				a++;
			}
		}
		System.out.println(sb);
	}
}