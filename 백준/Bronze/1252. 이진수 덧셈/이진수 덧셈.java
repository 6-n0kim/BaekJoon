import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 1001101 10010
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder rs = new StringBuilder();

		// 1011001 01001
		String s1 = sb1.append(st.nextToken()).reverse().toString();
		String s2 = sb2.append(st.nextToken()).reverse().toString();
		int arr[] = new int[Math.max(s1.length(), s2.length()) + 1];
		for (int i = 0; i < arr.length; i++) {
			if (s1.length() > i && s1.charAt(i) >= '1') {
				arr[i] += s1.charAt(i) - '0';
				while (arr[i] > 1) {
					arr[i + 1]++;
					arr[i] -= 2;
				}
			}
			if (s2.length() > i && s2.charAt(i) >= '1') {
				arr[i] += s2.charAt(i) - '0';
				while (arr[i] > 1) {
					arr[i + 1]++;
					arr[i] -= 2;
				}
			}
			rs.append(arr[i]);
		}
		System.out.println(new BigInteger(rs.reverse().toString()));
	}
}