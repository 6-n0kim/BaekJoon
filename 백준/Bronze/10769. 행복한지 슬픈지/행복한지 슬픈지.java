import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		String s=bf.readLine();
		int happy=0, sad=0;
		for(int i=0; i<s.length()-3; i++) {
			if(s.charAt(i)==':' && s.charAt(i+1)=='-' && s.charAt(i+2)==')')happy+=1;
			else if(s.charAt(i)==':' && s.charAt(i+1)=='-' && s.charAt(i+2)=='(')sad+=1;
		}
		if(happy==0 && sad==0) System.out.println("none");
		else if(happy==sad) System.out.println("unsure");
		else if(happy>sad) System.out.println("happy");
		else System.out.println("sad");
	}
}