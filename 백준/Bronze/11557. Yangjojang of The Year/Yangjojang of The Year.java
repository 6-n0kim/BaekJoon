import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


class YJJ implements Comparable<YJJ>{
	private String school;
	private int sul;

	public String getSchool() {return school;}

	public YJJ(String school, int sul) {
		this.school = school;
		this.sul = sul;
	}

	@Override
	public int compareTo(YJJ o) {
		if(sul > o.sul) return 1;
		else if(sul < o.sul) return -1;
		else return 0;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int T = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < T ; i++) {
			final int N = Integer.parseInt(br.readLine());
			ArrayList<YJJ> list = new ArrayList<YJJ>();
			for(int j = 0; j < N ; j++) {
				String strtmp = br.readLine();
				String[] strArr = strtmp.split(" ");
				list.add(new YJJ(strArr[0], Integer.parseInt(strArr[1])));
			}
			
			Collections.sort(list);
			YJJ yjj = list.get(N-1);
			if(i<T-1)
				sb.append(yjj.getSchool()+"\n");
			else
				sb.append(yjj.getSchool());
		}
		System.out.println(sb);
	}
}