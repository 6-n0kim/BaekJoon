import java.io.IOException;

public class Main {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		int n = readInt();
		for (int i = 0; i < n; i++) {
			int a = readInt();
			int b = readInt();
			int min = Math.min(a, b);
			int mul = 1;
			while (true) {
				if (min * mul % a == 0 && min * mul % b == 0) {
					break;
				} else {
					mul++;
				}
			}
			sb.append(min*mul).append("\n");
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