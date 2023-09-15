import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] dp = new int [11][11];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		System.out.println(binomial(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));

	}

	static int binomial(int n, int r) {
		if(r == 0 || n == r) 
			return 1;
		if(dp[n][r] == 0) 
			dp[n][r] = binomial(n - 1, r - 1) + binomial(n - 1, r);
		return dp[n][r];
	}
}