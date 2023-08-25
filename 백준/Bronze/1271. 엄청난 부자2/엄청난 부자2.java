import java.math.BigInteger;
import java.util.Scanner;

class Main {
	public static void main(String ergs[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		sc.close();
		System.out.println(A.divide(B));
		System.out.println(A.remainder(B));
	}
}