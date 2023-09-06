import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb= new StringBuilder();
		StringBuilder sb1= new StringBuilder();
		sb.append(str);
		sb1.append(str).reverse();
		System.out.println(sb.toString().equals(sb1.toString()) ? 1 : 0);
	}
}
