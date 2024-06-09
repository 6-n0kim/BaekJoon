import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigDecimal a = new BigDecimal(st.nextToken());
		BigDecimal b = new BigDecimal(st.nextToken());
		BigDecimal c = a.divide(b, 1001, BigDecimal.ROUND_DOWN);
		System.out.println(c);
	}
}
