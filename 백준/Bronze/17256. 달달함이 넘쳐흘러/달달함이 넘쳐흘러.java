import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int c[] = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int b[] = new int[3];
		b[0] = c[0] - a[2];
		b[1] = c[1] / a[1];
		b[2] = c[2] - a[0];
		System.out.println(b[0] + " " + b[1] + " " + b[2]);
	}
}