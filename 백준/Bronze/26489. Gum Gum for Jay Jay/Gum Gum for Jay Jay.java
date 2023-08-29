import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		while (true) {
			String string =br.readLine();
			if (string == null)break;
			i++;
		}
		System.out.println(i);
	}
}