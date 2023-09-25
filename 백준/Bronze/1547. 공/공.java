import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[51];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < m; i++) {
			boolean chk1 = true;
			boolean chk2 = true;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			for (int j = 1; j < arr.length; j++) {
				if (n1 == arr[j] && chk1) {
					n1 = j;
					chk1 = false;
				}
				if (n2 == arr[j] && chk2) {
					n2 = j;
					chk2 = false;
				}
				if (!chk1 && !chk2) {
					break;
				}
			}
			int temp = arr[n1];
			arr[n1] = arr[n2];
			arr[n2] = temp;
		}
		System.out.println(arr[1]);
	}
}