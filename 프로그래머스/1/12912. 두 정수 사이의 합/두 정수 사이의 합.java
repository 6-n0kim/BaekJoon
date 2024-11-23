class Solution {
    public long solution(int n, int m) {
        long answer = 0;
        if (n == m) return n;
			if (m < n) {
			    int  dept = n;
				n = m;
				m = dept;
			}
			
            for (long i = n; i <= m; i++) {
				answer+=i;
			}
			return answer;
		
    }
}