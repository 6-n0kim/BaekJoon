import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i=0; i<T; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, ",");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            System.out.println(a+b);
        }
    }
}