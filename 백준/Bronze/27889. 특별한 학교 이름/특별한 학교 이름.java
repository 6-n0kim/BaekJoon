import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		HashMap<String, String> hm = new HashMap<>();
		hm.put("NLCS", "North London Collegiate School");
		hm.put("BHA","Branksome Hall Asia");
		hm.put("KIS" , "Korea International School");
		hm.put("SJA","St. Johnsbury Academy");
		System.out.println(hm.get(s));
	}
}