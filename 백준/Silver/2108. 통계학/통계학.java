import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		int avg = (int) Math.round((double) sum / n);
		Arrays.sort(arr);
		
		int center = arr[n / 2];
		int range = arr[n - 1] - arr[0];

		int max = 0;
		int maxVal = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) > max) {
				max = map.get(arr[i]);
				maxVal = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == max && !list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		if (list.size() > 1) {
			Collections.sort(list);
			int count = 0;
			for (int i : list) {
				count++;
				if (count == 2) {
					maxVal = i;
				}
			}
		}
		System.out.println(avg);
		System.out.println(center);
		System.out.println(maxVal);
		System.out.println(range);
	}
}