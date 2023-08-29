import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		if(a % 4==0) {
			System.out.printf("%.1f",(double)a/4);	
		}else
		System.out.printf("%.2f",(double)a/4);
	}
}