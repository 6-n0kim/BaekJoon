import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean flow = true;
		for (int i = 0; i < n; i++) {
			
			
		if (flow) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			flow = false;
		}else {
			for (int j = 0; j < n; j++) {
				System.out.print(" *");
			}
			flow = true;
		}
			System.out.println();
		}
	}
}