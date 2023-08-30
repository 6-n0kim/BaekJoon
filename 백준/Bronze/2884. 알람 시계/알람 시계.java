import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int m = sc.nextInt();

        if (m < 45) {
            t--;
            m=60-(45-m);
			if(t<0)t=23;
            
            System.out.println(t + " " + m);
		}
		else{
            System.out.println(t + " " + (m-45));
        }
	}
}
