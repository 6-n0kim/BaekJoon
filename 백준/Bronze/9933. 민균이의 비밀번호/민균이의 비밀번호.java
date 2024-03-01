import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<N; i++) {
			String s = scanner.next();
			String rs = new StringBuffer(s).reverse().toString();
			
			// 입력받은 문자를 뒤집은 문자(rs)가 이미 리스트에 존재하면, 정답
			if(list.contains(rs) || s.equals(rs)) {
				System.out.println(s.length() + " " + s.charAt(s.length()/2));
				return;
			} else {
				list.add(s);
			}
		}
	}
}