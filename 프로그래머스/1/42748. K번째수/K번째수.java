import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] a, int[][] b) {
        		int answer[] = new int[b.length];
		for (int i = 0; i < b.length; i++) {

			int start = b[i][0] - 1;
			int end = b[i][1] - 1;
			List<Integer> list = new ArrayList<>();
			for (int j = start; j <= end; j++) {
				list.add(a[j]);
			}
			Collections.sort(list);
			answer[i] = list.get(b[i][2] - 1);
		}
        return answer;
    }
}