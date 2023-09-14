import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int x = 0;
        st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			if (Integer.parseInt(st.nextToken()) % 2 == 0) {
				x++;
			}
		}
		int y=a-x;
		if (x>y) {
			System.out.println("Happy");
		}else {
			System.out.println("Sad");
		}

	}
}