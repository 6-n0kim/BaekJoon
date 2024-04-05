import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

class Main {
    static PriorityQueue<Integer> pq;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int W = getScore();
        int K = getScore();
        System.out.println(W+" "+K);
    }

    static int getScore() throws IOException {
        int answer = 0;
        //우선순위 큐 선언
        pq = new PriorityQueue<>(new Comparator<Integer>() {
        	//익명 클래스 new Comparator를 선언하고 크기비교 로직을
            //오버라이드로 재정의해준다.
            //return이 음수이면 o1이 앞으로, 양수이면 o2가 앞으로 온다.
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i = 1 ; i <= 10 ; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }
        for(int i = 1 ; i <= 3 ; i++){
            answer += pq.poll();
        }
        return answer;
    }
}