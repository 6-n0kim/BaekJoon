import java.util.Scanner;

class Main {
	public static void main(String ergs[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = 1 + sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(b/a);
		}
		sc.close();
	}
}