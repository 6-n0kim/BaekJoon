import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(t-->0) {
			String str = br.readLine();
			String s = str.substring(0,1) + str.substring(str.length()-1);
			sb.append(s).append("\n");
		}
		System.out.println(sb);
	}
}