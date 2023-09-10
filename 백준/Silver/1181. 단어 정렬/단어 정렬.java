import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; i++) {
			list.add(br.readLine());
		}
		String[] arr = list.stream().distinct().toArray(String[]::new);

		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				if (a.length() == b.length()) {
					return a.compareTo(b);
				} else {
					return a.length() - b.length();
				}
			}
		});

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
	}
}