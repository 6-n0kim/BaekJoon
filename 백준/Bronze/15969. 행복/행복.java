import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	
    	int n=scanner.nextInt();
    	List<Integer> num=new ArrayList<Integer>();
    	
    	for(int i=0;i<n;i++) {
    		num.add(scanner.nextInt());
    	}
    	
    	System.out.println(Collections.max(num)-Collections.min(num));
   }
}