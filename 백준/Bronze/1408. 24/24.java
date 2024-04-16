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
		int now = (3600 * arr[0]) + (60 * arr[1]) + arr[2];

		st = new StringTokenizer(br.readLine());
		arr = Stream.of(st.nextToken().split(":")).mapToInt(Integer::parseInt).toArray();
		int start = (3600 * arr[0]) + (60 * arr[1]) + arr[2];
		
		int time = 0;
		if (start > now) {
			time = start - now;
		}else { 
			time = (24*3600) - (now - start);
		}
		System.out.format("%02d:%02d:%02d", (time / 3600), ((time / 60) % 60), (time % 60));
	}
}
