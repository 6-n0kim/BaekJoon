import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		String[]arr = br.readLine().split(" ");
		int a = Integer.parseInt(sb.append(arr[0]).reverse().toString());
		int b = Integer.parseInt(sb1.append(arr[1]).reverse().toString());
		System.out.println(Math.max(a, b));
	}
}