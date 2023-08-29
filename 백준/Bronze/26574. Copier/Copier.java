import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb =new StringBuilder();
		while(a-->0) {
			String s = br.readLine();
			sb.append(s + " " +s).append("\n");
		}
		System.out.println(sb);
	}
}