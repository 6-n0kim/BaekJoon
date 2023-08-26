import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static long[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int len = Integer.parseInt(br.readLine());

		String[] arr = new String[len];
		for (int i = 0; i < len; i++) {
			arr[i] = (br.readLine());
		}
		String standard = arr[0];
		String[] arr0 = standard.split("");

		for (String s : arr) {
			String[] arr2 = s.split("");
			for (int i = 0; i < arr2.length; i++) {
				if (!arr2[i].equals(arr0[i])) {
					arr0[i] = "?";
				}
			}
		}
		String result = "";
		for (String s : arr0) {
			result += s;
		}
		System.out.println(result);
	}
}