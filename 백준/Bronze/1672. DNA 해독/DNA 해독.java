import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		char arr[] = sb.append(br.readLine()).reverse().toString().toCharArray();
		br.close();
		for (int i = 0; i < arr.length - 1;) {
			arr[i + 1] = fn(arr[i++], arr[i]);
		}
		System.out.println(arr[arr.length-1]);

	}

	private static char fn(char A, char B) {
		char result = ' ';
        if (A == 'A') {
            if (B == 'A')
                result = 'A';
            else if (B == 'G')
                result = 'C';
            else if (B == 'C')
                result = 'A';
            else if (B == 'T')
                result = 'G';
        } else if (A == 'G') {
            if (B == 'A')
                result = 'C';
            else if (B == 'G')
                result = 'G';
            else if (B == 'C')
                result = 'T';
            else if (B == 'T')
                result = 'A';
        } else if (A == 'C') {
            if (B == 'A')
                result = 'A';
            else if (B == 'G')
                result = 'T';
            else if (B == 'C')
                result = 'C';
            else if (B == 'T')
                result = 'G';
        } else if (A == 'T') {
            if (B == 'A')
                result = 'G';
            else if (B == 'G')
                result = 'A';
            else if (B == 'C')
                result = 'G';
            else if (B == 'T')
                result = 'T';
        }
        return result;
    }

}