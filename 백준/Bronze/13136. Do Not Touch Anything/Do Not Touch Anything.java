import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();
        long x, y;
        if (r%n > 0)
            x = r/n + 1;
        else
            x = r/n;
        if (c%n > 0)
            y = c/n + 1;
        else
            y = c/n;
        System.out.println(x*y);
    }
}