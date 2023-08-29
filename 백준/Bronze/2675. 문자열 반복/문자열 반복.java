import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n-- > 0) {
			int rp = sc.nextInt();
			String []s = sc.next().split("");
			for (int i = 0; i < s.length; i++) {
				String org =s[i];
				for (int j = 1; j < rp; j++) {
				s[i] +=org;	
				}
			}
			for (int i = 0; i < s.length; i++) {
				System.out.print(s[i]);
			}
			System.out.println();
		}
	}
}