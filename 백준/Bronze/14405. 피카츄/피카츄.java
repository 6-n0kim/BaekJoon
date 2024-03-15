import java.util.*;
import java.io.*;

interface Main{
    static void main(String[]a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = "";
        S = br.readLine();
        String regex = "pi|ka|chu";
        S = S.replaceAll(regex, "");
        if(S.equals("")) {
          bw.write("YES");
        } else {
          bw.write("NO");
        }
        bw.flush();
    }
}