import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
	        ArrayList<Integer> list = new ArrayList<>();
	        for (int i : arr) {
				if (i % divisor == 0) {
					list.add(i);
				}
			}
	        
	        int[] answer = new int [list.size()];
	        for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
	        if (answer.length == 0) {
	        	int [] arr1 ={-1};
	        	return arr1;
			}
	        Arrays.sort(answer);
	        return answer;
	    }
}