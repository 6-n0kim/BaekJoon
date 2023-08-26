import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static long[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int a = Integer.parseInt(br.readLine()); 
		
		arr = new long[a+1];
		
		for (int i = 0; i < a+1; i++) {
			arr[i] = -1;
		}
		
		arr[0] = 0;
		arr[1] = 1;
		
		System.out.println(fn(a));
	}

	public static long fn(int n) {
		if(arr[n] == -1) {
			arr[n] = fn(n-1) +fn(n-2);
		}
		return arr[n];
	}
}