import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		a *=Integer.parseInt(st.nextToken());;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < 5; i++) {
			int n = Integer.parseInt(st.nextToken());
			sb.append(n-a+" ");
		}
		System.out.println(sb);
	}
}