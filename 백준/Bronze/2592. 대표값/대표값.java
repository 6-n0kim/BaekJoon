import java.util.*;
import java.io.*;
          public class Main {
              private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
              public static void main (String args[]) throws IOException {
                  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  int arr[] = new int[1001];
                  int sum = 0;
                  for (int i = 0; i < 10; i++) {
                      int N = Integer.parseInt(br.readLine());
                      sum += N;
                      arr[N]++;
                  }
                  int max = 0;
                  int maxIdx = 0;
                  for (int i = 0; i < 1001; i++) {
                      if (max < arr[i]) {
                          max = arr[i];
                          maxIdx = i;
                      }
                  }
                  bw.write(sum / 10 + "\n");
                  bw.write(String.valueOf(maxIdx));
                  bw.flush();
              }
          }