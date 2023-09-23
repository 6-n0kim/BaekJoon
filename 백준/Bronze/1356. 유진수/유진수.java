import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] arr = s.split("");
		int fa[] = new int[arr.length];
		int ba[] = new int[arr.length];
		boolean chk = false;
		int front = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			front *= Integer.parseInt(arr[i]);
			fa[i] = front;
		}

		int back = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			back *= Integer.parseInt(arr[i]);
			ba[i] = back;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (fa[i] == ba[i + 1]) {
				chk = true;
				break;
			}
		}

		if (chk) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}