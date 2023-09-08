import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int child = 1;
		int parent = 1;
		int max = 1;
		boolean flow = true;
		for (int i = 1; i < n; i++) {
			if (parent == max && child == 1 && flow == true) {
				parent++;
				max++;
				flow = false;
			} else if (child == max && parent == 1 && flow == false) {
				child++;
				max++;
				flow = true;
			} else if (parent > 1 && child < max && flow == false) {
				parent--;
				child++;
			}  else if (child > 1 && parent < max && flow == true) {
				parent++;
				child--;
			}
		}
		System.out.println(child + "/" + parent);
	}
}