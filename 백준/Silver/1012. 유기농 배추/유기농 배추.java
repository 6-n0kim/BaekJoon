import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static int m, n;

    static void dfs(int x, int y) {
        if (x < 0 || x >= m || y < 0 || y >= n || arr[x][y] == 0)
            return;
        arr[x][y] = 0;
        dfs(x + 1, y);
        dfs(x - 1, y);
        dfs(x, y + 1);
        dfs(x, y - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            arr = new int[m][n];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                arr[x][y] = 1;
            }

            int cnt = 0;

            for (int j = 0; j < m; j++) {
                for (int h = 0; h < n; h++) {
                    if (arr[j][h] == 1) {
                        cnt++;
                        dfs(j, h);
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}