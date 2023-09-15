import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	   public static void main(String[] args) throws Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int n = Integer.parseInt(br.readLine());
	      char arr[] = br.readLine().toCharArray();

	      BigInteger bi = new BigInteger("31");
	      BigInteger rs = new BigInteger("0");

	      for (int i = 0; i < arr.length; i++) {
	         BigInteger a = new BigInteger(String.valueOf(arr[i] - 96));
	         rs = rs.add(a.multiply(bi.pow(i)));
	      }
	      System.out.println(rs.remainder(BigInteger.valueOf(1234567891)));
	   }
	}