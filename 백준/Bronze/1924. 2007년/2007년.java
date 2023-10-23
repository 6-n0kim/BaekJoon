import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		int year[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String week[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int tot = n;
		for (int i = 1; i < tot; i++) {
			n += year[i];
		}
		m += n - tot;
		System.out.println(week[m % 7]);
	}
}