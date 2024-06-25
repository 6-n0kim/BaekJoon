import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		char[] p = br.readLine().toCharArray();
		int[] pi = new int[p.length];
		
		for (int i = 1, j = 0; i < p.length; i++) {
			while (j > 0 && p[i] != p[j])
				j = pi[j - 1];
			
			if (p[i] == p[j])
				pi[i] = ++j;
		}
		
		boolean flag = false;
		for (int i = 0, j = 0; i < s.length; i++) {
			while (j > 0 && s[i] != p[j])
				j = pi[j - 1];
			
			if (s[i] == p[j]) {
				if (j == p.length - 1) {
					flag = true;
					break;
				} else
					++j;
			}
		}
		
		System.out.println(flag ? 1 : 0);
	}
}