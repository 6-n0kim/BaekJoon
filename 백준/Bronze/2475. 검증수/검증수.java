import java.math.BigInteger;
import java.util.Scanner;

class Main {
	public static void main(String ergs[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = sc.nextBigInteger();
		BigInteger d = sc.nextBigInteger();
		BigInteger e = sc.nextBigInteger();
		
		BigInteger answer = a.pow(2).add(b.pow(2)).add(c.pow(2)).add(d.pow(2)).add(e.pow(2));
		System.out.println(answer.remainder(new BigInteger("10")));
		
		sc.close();
	}
}