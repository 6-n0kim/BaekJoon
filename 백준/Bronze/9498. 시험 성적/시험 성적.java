import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String result = "F";
		
		if (a >= 60) {
			result = "D";
			if (a >= 70) {
				result = "C";
				if (a >=80) {
					result = "B";
					if (a >=90) {
						result = "A";
					}
				}
			}
		}
		System.out.println(result);
	}
}