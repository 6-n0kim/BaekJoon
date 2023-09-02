import java.util.Scanner;

class Main {
	public static void main(String ergs[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int bus = sc.nextInt();
		int subway = sc.nextInt();

		if (bus < subway) {
			System.out.println("Bus");
		} else if (bus == subway) {
			System.out.println("Anything");
		} else {
			System.out.println("Subway");
		}
	}
}