import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] humans = new int[size];
		for(int i=0;i<size;i++)
			humans[i] = sc.nextInt();
		
		int cnt = 0;
		for(int i=0;i<size;i++) {
			int tmp = humans[i];
			for(int j=i+1;j<size;j++) {
				if(tmp==humans[j]) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}