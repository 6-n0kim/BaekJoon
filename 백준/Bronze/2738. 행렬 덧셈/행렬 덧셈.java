import java.util.Scanner;

class Main {
	public static void main(String ergs[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int[][] arr = new int[a][b];
		for (int k = 0; k < 2; k++) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] += sc.nextInt();
				}
			}
		}
		
		sc.close();
		
		for(int[]arr1 : arr ) {
			for(int i : arr1) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}