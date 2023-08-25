import java.util.Scanner;

class Main {
	public static void main(String ergs[]) {
		Scanner sc = new Scanner(System.in);
			String a = sc.next();
			String b = sc.next();
			sc.close();
			System.out.println(a.indexOf(b) >-1 ? "go" : "no");
	}
}