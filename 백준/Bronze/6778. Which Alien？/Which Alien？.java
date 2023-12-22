import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		 if (n >= 3 && m <=4){
	            System.out.println("TroyMartian");
	        }if(n <= 6 && m >= 2 ){
	            System.out.println("VladSaturnian");
	        }if(n <=2 && m <= 3){
	            System.out.println("GraemeMercurian");
	        }else {

	        }
	}
}