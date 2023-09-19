import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int y1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int d1 = Integer.parseInt(st.nextToken());
		 LocalDate date1 = LocalDate.of(y, m, d); // 첫 번째 날짜
	     LocalDate date2 = LocalDate.of(y1, m1, d1); // 두 번째 날짜
	     long daysBetween = ChronoUnit.DAYS.between(date1, date2);
	     if ((y1 - y > 1000) || (y1 - y == 1000 && m1 > m)
					|| (y1 - y == 1000 && m1 == m && d1 >= d)) {
				System.out.println("gg");
		}else {
			System.out.println("D-"+daysBetween);
		}
	}
}