import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static boolean arr[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s [] = br.readLine().split(" ");
		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);
		arr= new boolean [n+1];
        arr[0] = arr[1] = true;
        
        for(int i=2; i*i<=n; i++){
            if(!arr[i]){
            	for(int j=i*i; j<=n; j+=i) arr[j] = true;                
            }        
        }
        for (int i = m; i < arr.length; i++) {
			if (!arr[i]) {
				sb.append(i).append("\n");
			}
		}
        System.out.println(sb);
	}
}