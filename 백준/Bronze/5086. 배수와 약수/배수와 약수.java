import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        while (true) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
        	if (a == b && a==0) {
        		break;
        	}
        	else if (a>b && a % b == 0) {
				sb.append("multiple\n");
			}else if(b>a && b % a ==0) {
				sb.append("factor\n");
			}else {
				sb.append("neither\n");
			}
		}
        System.out.println(sb);
	}
}