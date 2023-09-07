import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[]arr = br.readLine().split(" ");
		StringBuilder sb =new StringBuilder();
		String str0 = arr[0];
		String str = sb.append(str0).reverse().toString();
		int n = Integer.parseInt(arr[1]);
		BigInteger sum = new BigInteger("0") ;
		for (int i = 0; i < str.length(); i++) {
			int a = 0;
			if (str.charAt(i) >57) {
				a = str.charAt(i)-55;
			}else {
				a = str.charAt(i)-48;
			}
			BigInteger b= BigDecimal.valueOf(Math.pow(n, i)).toBigInteger();
			BigInteger c = BigDecimal.valueOf((double)a).toBigInteger();
			
			sum = sum.add(b.multiply(c));
		}
		System.out.println(sum);
	}
}
