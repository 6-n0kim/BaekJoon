import java.util.Scanner;

public class Main {

	static long[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		arr = new long[a+1];
		
		for (int i = 0; i < a+1; i++) {
			arr[i] = -1;
		}
		
		arr[0] = 0;
		arr[1] = 1;
		
		System.out.println(fn(a));
		sc.close();
	}

	public static long fn(int n) {
		if(arr[n] == -1) {
			arr[n] = fn(n-1) +fn(n-2);
		}
		return arr[n];
	}
}