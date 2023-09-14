import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1[] = br.readLine().split(" ");
		int a=0;
		for(String s : s1) {
			if(s.equals("0") || s.equals("1")) {
			}else {
				a++;
			}
		}
		System.out.println(a==0?"S":"F");
	}
}