import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		while(true) {
			String [] arr = br.readLine().split(" ");
			
			if (arr[0].equals("0") && arr[1].equals("0")) {
				break;
			}else {
				sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) +"\n");
			}
		}
		System.out.println(sb);
	}
}
