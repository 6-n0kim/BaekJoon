import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = "";
		if (n >= 380) {
			s = "Violet";
			if (n >= 425) {
				s = "Indigo";
				if (n >= 450) {
					s = "Blue";
					if (n >= 495) {
						s = "Green";
						if (n >= 570) {
							s = "Yellow";
							if (n >= 590) {
								s = "Orange";
								if (n >= 620) {
									s = "Red";
								}
							}
						}
					}
				}
			}
		}
		System.out.println(s);
	}
}