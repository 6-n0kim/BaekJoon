import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        // 입력값으로 -도 들어올수 있다.최소가 -100이라 -101정도로 선언해도 무방
        int min =Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        //온도를 입력받는다.
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        // N-M+1
        for(int i=0;i<=N-M;i++){
            //한번 돌 때 마다 초기화
            int sum=0;
            for(int j=0;j<M;j++){
                // 숫자를 하나씩 전진시키면서 M의 누적합을 계산
                sum=sum+arr[i+j];
            }
            if(sum>min)
                min=sum;
        }
        System.out.println(min);

    }
}