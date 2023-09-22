import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[] love = new int[4];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sArr[] = br.readLine().split("");
		fn(sArr, love, true);

		int n = Integer.parseInt(br.readLine());
		int teamArr[][] = new int[n][4];
		int rs[] = new int[n];
		int max = -1;
		String val = "";
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] arr = str.split("");
			fn(arr, teamArr[i], false);
			int L = teamArr[i][0];
			int O = teamArr[i][1];
			int V = teamArr[i][2];
			int E = teamArr[i][3];
			rs[i] = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
			if (rs[i] > max) {
				max = rs[i];
				val = str;
			} else if (rs[i] == max) {
				String s[] = new String[2];
				s[0] = str;
				s[1] = val;
				Arrays.sort(s);
				val = s[0];
			}
		}
		System.out.println(val);
	}

	private static void fn(String[] sArr, int[] iArr, boolean chk) {
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].equals("L")) {
				iArr[0]++;
			}
			if (sArr[i].equals("O")) {
				iArr[1]++;
			}
			if (sArr[i].equals("V")) {
				iArr[2]++;
			}
			if (sArr[i].equals("E")) {
				iArr[3]++;
			}
		}
		if (!chk) {
			for (int i = 0; i < 4; i++) {
				iArr[i] += love[i];
			}
		}
	}
}