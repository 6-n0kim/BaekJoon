import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[4];

		for (int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int chk;

		if (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3])
			System.out.printf("Fish Rising");
		else if (arr[0] > arr[1] && arr[1] > arr[2] && arr[2] > arr[3])
			System.out.printf("Fish Diving");
		else if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3])
			System.out.printf("Fish At Constant Depth");
		else
			System.out.printf("No Fish");
	}

}
