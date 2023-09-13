import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int tree[]=new int [n];
		for (int i = 0; i < tree.length; i++) {
			tree[i]=Integer.parseInt(br.readLine());
		}
		int gcd = tree[1]-tree[0];
		for (int i = 2; i < tree.length; i++) {
			int m = tree[i] - tree[i-1];
			gcd = fn(m,gcd);
		}
		 System.out.println((tree[n-1]-tree[0])/gcd+1-(tree.length));
	}
	private static int fn(int i, int j) {
		while (j != 0) {
			int temp = j;
			j = i % j;
			i = temp;
		}
		return i;
	}
}