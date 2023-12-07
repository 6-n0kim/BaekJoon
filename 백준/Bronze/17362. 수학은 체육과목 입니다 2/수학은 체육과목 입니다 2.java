import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = {1,2,3,4,5,4,3,2};
		int n = (Integer.parseInt(br.readLine())- 1) % 8 ;
		System.out.println(arr[n]);
	}
}