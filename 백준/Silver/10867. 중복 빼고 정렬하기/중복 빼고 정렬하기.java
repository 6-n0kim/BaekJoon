import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i=0; i < cnt; i++){
            hashSet.add(sc.nextInt());   
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
        Collections.sort(arrayList);

        StringBuilder sb = new StringBuilder();
        for (int i : arrayList){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}