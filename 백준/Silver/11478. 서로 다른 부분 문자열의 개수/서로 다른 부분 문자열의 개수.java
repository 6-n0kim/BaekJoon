import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String arr[] = str.split("");
		Map<String, Integer>map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j<= arr.length; j++) {
				String s = str.substring(i,j);
				if (!map.containsKey(s)) map.put(s, 0);
			}
		}
		System.out.println(map.size());
	}
}