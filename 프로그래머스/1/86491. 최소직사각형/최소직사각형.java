class Solution {
    public int solution(int[][] sizes) {
        int max1 = 0;
		int max2 = 0;
		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] < sizes[i][1]) {
				int temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
			}

			if (max1 < sizes[i][0]) {
				max1 = sizes[i][0];
			}
			if (max2 < sizes[i][1]) {
				max2 = sizes[i][1];
			}
		}
		
		int answer = max1 *max2;
        return answer;
    }
}