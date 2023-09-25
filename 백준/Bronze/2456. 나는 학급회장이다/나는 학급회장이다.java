import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int a[] = new int[m];
		int b[] = new int[m];
		int c[] = new int[m];
		int as = 0;
		int bs = 0;
		int cs = 0;
		int a3 = 0;
		int b3 = 0;
		int c3 = 0;
		int a2 = 0;
		int b2 = 0;
		int c2 = 0;
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int ai = Integer.parseInt(st.nextToken());
			as += a[i] = ai;
			int bi = Integer.parseInt(st.nextToken());
			bs += b[i] = bi;
			int ci = Integer.parseInt(st.nextToken());
			cs += c[i] = ci;
			if (ai == 3) {
				a3++;
			}
			if (ai == 2) {
				a2++;
			}
			if (bi == 3) {
				b3++;
			}
			if (bi == 2) {
				b2++;
			}
			if (ci == 3) {
				c3++;
			}
			if (ci == 2) {
				c2++;
			}
		}
		int max = (Math.max(as, Math.max(cs, bs)));
		int rs = 0;
		if (max == as && max == bs && max == cs) {
			if (a3 > b3 && a3 > c3) {
				rs = 1;
			} else if (b3 > c3 && b3 > a3) {
				rs = 2;
			} else if (c3 > b3 && c3 > a3) {
				rs = 3;
			} else {
				rs = 0; // 세명 다 동점
			}
		} else if (max == as && max == bs) {
			if (a3 == b3) {
				if (a2 == b2) {
					rs = 0; // 1 2 가 같고 3점과 2점이 같을때
				} else if (a2 > b2) {
					rs = 1;
				} else {
					rs = 2;
				}
			} else if (a3 > b3) {
				rs = 1;
			} else {
				rs = 2;
			}
		} else if (max == as && max == cs) {
			if (a3 == c3) {
				if (a2 == c2) {
					rs = 0;
				} else if (a2 > c2) {
					rs = 1;
				} else {
					rs = 3;
				}
			} else if (a3 > c3) {
				rs = 1;
			} else {
				rs = 3;
			}
		} else if (max == bs && max == cs) {
			if (b3 == c3) {
				if (b2 == c2) {
					rs = 0;
				} else if (b2 > c2) {
					rs = 2;
				} else {
					rs = 3;
				}
			} else if (b3 > c3) {
				rs = 2;
			} else {
				rs = 3;
			}
		} else if (max == as) {
			rs = 1;
		} else if (max == bs) {
			rs = 2;
		} else if (max == cs) {
			rs = 3;
		} else {
			rs = 0;
		}
		System.out.println(rs + " " + max);
	}
}
