class Solution {
    public boolean solution(int x) {
        boolean answer = false;
			
			int n = 0;
			int p = x;
			while(x > 0) {
				int a = x % 10;
				x/=10;
				n+=a;
			}
			if (p % n == 0) answer = true;
			return answer;
		}
}