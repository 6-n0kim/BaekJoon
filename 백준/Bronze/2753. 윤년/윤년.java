import java.util.Scanner;

class Main {
	public static void main(String ergs[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int result = 0;
		sc.close();
		if(a % 4 == 0){
            result = 1;
            if(a % 400 == 0){
            }else if(a % 100 == 0){
               result = 0; 
            }
        }
        System.out.print(result);
	}
}