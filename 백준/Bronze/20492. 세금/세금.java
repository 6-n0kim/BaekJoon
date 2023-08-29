import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = (int) (0.78*n);
		int b = (int) (0.8*n + (0.2*n)*0.78);
		System.out.println(a +" " + b);
	}
}