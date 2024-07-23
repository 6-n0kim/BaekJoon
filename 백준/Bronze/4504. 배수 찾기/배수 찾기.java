import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (true) {
            int t  =Integer.parseInt(br.readLine());
            if(t == 0)break;
            if(t%n==0)sb.append(t + " is a multiple of " + n + ".\n");
            else sb.append(t + " is NOT a multiple of " + n + ".\n");
            }
        System.out.println(sb);
	}
}