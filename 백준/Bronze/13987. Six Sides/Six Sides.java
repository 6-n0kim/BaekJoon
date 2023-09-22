import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int dice1[] = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()) };

		st = new StringTokenizer(br.readLine());
		int dice2[] = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()) };
		double tot = 0;
		double win = 0;
		for (int i = 0; i < dice1.length; i++) {
			for (int j = 0; j < dice2.length; j++) {
				if (dice1[i] > dice2[j]) {
					win++;
				} else if (dice1[i] == dice2[j]) {
					tot++;
				}
			}
		}
		System.out.printf("%.5f", win / (36 - tot));
	}
}