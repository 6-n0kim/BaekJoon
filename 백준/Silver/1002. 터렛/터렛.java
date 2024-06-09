import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        int T = readInt();
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            int x1 = readInt(), y1 = readInt(), r1 = readInt();
            int x2 = readInt(), y2 = readInt(), r2 = readInt();
            double r = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
            if(r<Math.abs(r2-r1) || r > r1+r2)
                sb.append(0+"\n");
            else if(Math.abs(r2-r1)<r && r<r1+r2)
                sb.append(2+"\n");
            else if(r>0)
                sb.append(1+"\n");
            else
                sb.append(-1+"\n");
        }
        System.out.println(sb);
    }

    static int readInt() throws IOException {
        int sum = 0;
        boolean isNegative = false;
        while (true) {
            int input = System.in.read();
            if (input == '\n' || input == ' ')
                return isNegative ? sum * -1 : sum;
            else if (input == '-')
                isNegative = true;
            else
                sum = (sum * 10) + input - '0';
        }
    }
}