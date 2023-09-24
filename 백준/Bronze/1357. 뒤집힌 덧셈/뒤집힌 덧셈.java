import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder rs = new StringBuilder();
		String s1 = sb1.append(st.nextToken()).reverse().toString();
		String s2 = sb2.append(st.nextToken()).reverse().toString();
		rs.append(Integer.parseInt(s1) + Integer.parseInt(s2)).reverse();
		System.out.println(Integer.parseInt(rs.toString()));
	}
}