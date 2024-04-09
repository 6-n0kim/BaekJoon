import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long answer = 0;
		st = new StringTokenizer(br.readLine());
		String s = st.nextToken().replaceAll("[^0-9]", " ");
		String [] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("")) {
				
			}else {
				int m = Integer.parseInt(arr[i]);
				answer +=m;	
			}
			
		}
		System.out.println(answer);
	}
}
