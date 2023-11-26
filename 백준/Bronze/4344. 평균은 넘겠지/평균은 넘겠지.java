import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int sum = 0;
			int arr[] = new int[m];
			for (int j = 0; j < m; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			double avg = sum / m;
			double cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if (avg < arr[j]) {
					cnt++;
				}
			}
			System.out.printf("%.3f%s\n" , cnt/m*100,"%");
		}
	}
}