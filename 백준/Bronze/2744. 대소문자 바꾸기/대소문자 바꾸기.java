import java.util.Scanner;

class Main {
	public static void main(String ergs[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		for(String s : a.split("")) {
			System.out.print(s.toUpperCase().equals(s) ? s.toLowerCase() : s.toUpperCase());
		}
	}
}