import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int []arr =new int[26];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= -1;
		}
		
		String s = br.readLine();
		
		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i)-97] == -1) {
				arr[s.charAt(i)-97] =i;	
			};
		}
		
		for (int i : arr) {
			sb.append(i+ " ");
		}
		System.out.println(sb);
	}
}