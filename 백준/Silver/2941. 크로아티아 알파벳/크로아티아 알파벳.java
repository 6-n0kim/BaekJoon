import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String rs = str.replace("c=", "*").replace("c-", "*").replace("dz=", "*").replace("d-", "*").replace("lj", "*").replace("nj", "*").replace("s=", "*").replace("z=", "*");
		
		System.out.println(rs.length());
	}
}
