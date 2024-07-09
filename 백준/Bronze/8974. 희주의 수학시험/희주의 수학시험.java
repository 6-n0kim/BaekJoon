import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[1001];
		int num = 1;
		int as = 0;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = num;
			as++;
			if (as == num) {
				as = 0;
				num++;
			}
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		as = 0;
		for (int i = a; i <= b; i++) {
			as += arr[i];
		}
		System.out.println(as);
	}
}