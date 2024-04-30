import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //scanner 와 유사
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26]; //알파벳 개수 배열
        int max = 0;
        String as; //EOF 처리를 위해 받을 문자열;; 이거땜에 엄청 헤맴
        String s = "";


        while ((as = br.readLine()) != null) {
            s += as;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                arr[s.charAt(i) - 'a']++;

                if (arr[s.charAt(i) - 'a'] > max) {
                    max = arr[s.charAt(i) - 'a'];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
               sb.append((char) (i + 'a'));
            }
        }
        System.out.println(sb);

    }
}
