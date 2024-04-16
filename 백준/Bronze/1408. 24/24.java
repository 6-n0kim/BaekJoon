import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = Stream.of(st.nextToken().split(":")).mapToInt(Integer::parseInt).toArray();

		st = new StringTokenizer(br.readLine());
		int arr2[] = Stream.of(st.nextToken().split(":")).mapToInt(Integer::parseInt).toArray();
		int h = arr2[0] - arr[0];
		int m = arr2[1] - arr[1];
		int s = arr2[2] - arr[2];

		String answer = "";
		if (s < 0) {
			s += 60;
			m -= 1;
		}
		if (m < 0) {
			m += 60;
			h -= 1;
		}
		if (m < 0) {
			m += 60;
			h -= 1;
		}
		if (h < 0) {
			h += 24;
		}

		if (h < 10) {
			answer += "0" + h;
		} else {
			answer += h;
		}
		answer += ":";
		if (m < 10) {
			answer += "0" + m;
		} else {
			answer += m;
		}
		answer += ":";
		if (s < 10) {
			answer += "0" + s;
		} else {
			answer += s;
		}
		System.out.println(answer);
	}
}
