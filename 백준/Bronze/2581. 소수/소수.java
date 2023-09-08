import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[b+1];
		arr[1] = true;
		for(int i = 2; i <= Math.sqrt(b); i++) {
			if(arr[i]) continue;
			for(int j = i + i; j <= b; j += i) {
				arr[j] = true;
			}
		}
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = a; i <= b; i++) {
			if(!arr[i]) {
				sum += i;
				min = Math.min(min, i);
			}
		}
		
		if(sum == 0) System.out.println(-1);
		else {
			System.out.println(sum+"\n"+min);
		}
	}
}
