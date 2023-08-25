import java.util.Scanner;

class Main {
	public static void main(String ergs[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
        String num = "";
		sc.close();
		for(String s : a.split("")) {
			num = 	s.equals("A") ? num+="4" : 
		            s.equals("B") ? num+="3" : 
		            s.equals("C") ? num+="2" : 
		            s.equals("D") ? num+="1" :
		            s.equals("F") ? num+="0.0" :
		            s.equals("+") ? num+=".3" :
		            s.equals("0") ? num+=".0" : 
		            s.equals("-") ? num=String.valueOf(Integer.parseInt(num)- 1) + ".7" : num;
		}
		System.out.println(num);
	}
}