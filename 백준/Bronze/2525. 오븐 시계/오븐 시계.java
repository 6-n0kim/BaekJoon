import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int []arr = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int n = Integer.parseInt(br.readLine());
		arr[1]+=n;
		
		while(arr[1]>=60) {
			arr[1]-=60;
			arr[0]+=1;
			if (arr[0]>=24) {
				arr[0]-=24;
			}
		}
		System.out.println(arr[0] +" " + arr[1]);
	}
}