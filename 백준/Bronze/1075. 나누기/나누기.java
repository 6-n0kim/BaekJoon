import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		label : for (int i = 0; i <10; i++) {
			for (int j = 0; j < 10; j++) {
				int rs= Integer.parseInt(s.substring(0, s.length()-2)+ String.valueOf(i)+String.valueOf(j));
				if (rs%n==0) {
					System.out.println(String.valueOf(i)+String.valueOf(j));
					break label;
				}
			}
		}
	}
}