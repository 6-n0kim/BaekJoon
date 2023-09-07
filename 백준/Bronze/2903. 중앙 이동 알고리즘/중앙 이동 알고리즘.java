import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr [] =new int[16];
		arr[1]=3;
		for (int i = 2; i < arr.length; i++) {
			arr[i]= arr[i-1]*2-1;
		}
		int t = Integer.parseInt(br.readLine());
		System.out.println((int)Math.pow(arr[t], 2));
	}
}

