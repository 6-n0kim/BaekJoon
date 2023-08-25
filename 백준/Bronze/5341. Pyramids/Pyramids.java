import java.util.Scanner;

class Main {
	public static void main(String ergs[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			if (a == 0)
				break;
			System.out.println((a+1)*(a+1 /2) /2);
		}
		sc.close();
	}
}