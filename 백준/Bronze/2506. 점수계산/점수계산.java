import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    int point = 1, sum = 0;
    for (char c : br.readLine().toCharArray()) {
      if (c == '0') {
        point = 1;
      } else if (c == '1') {
        sum += point++;
      }
    }
    System.out.println(sum);
  }
}