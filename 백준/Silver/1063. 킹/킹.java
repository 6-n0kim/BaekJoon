import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] king = st.nextToken().toCharArray();
		char[] doll = st.nextToken().toCharArray();
		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			String move = br.readLine();

		    if (move.equals("R")) {
				king[0] += 1;
				if (king[0] > 'H') {
					king[0] -= 1;
				}
				if (king[0] == doll[0] && king[1] == doll[1]) {
					doll[0] += 1;
					if (doll[0] > 'H') {
						king[0] -= 1;
						doll[0] -= 1;
					}
				}
			}
			else if (move.equals("L")) {
				king[0] -= 1;
				if (king[0] < 'A') {
					king[0] += 1;
				}
				if (king[0] == doll[0] && king[1] == doll[1]) {
					doll[0] -= 1;
					if (doll[0] < 'A') {
						king[0] += 1;
						doll[0] += 1;
					}
				}
			}
			else if (move.equals("T")) {
				king[1] += 1;
				if (king[1] > '8') {
					king[1] -= 1;
				}
				if (king[0] == doll[0] && king[1] == doll[1]) {
					doll[1] += 1;
					if (doll[1] > '8') {
						king[1] -= 1;
						doll[1] -= 1;
					}
				}
			}
			else if (move.equals("B")) {
				king[1] -= 1;
				if (king[1] < '1') {
					king[1] += 1;
				}
				if (king[0] == doll[0] && king[1] == doll[1]) {
					doll[1] -= 1;
					if (doll[1] < '1') {
						king[1] += 1;
						doll[1] += 1;
					}
				}
			}
			else if (move.equals("RT")) {
				king[0] += 1;
				king[1] += 1;

				if (king[0] > 'H' || king[1] > '8') {
					king[0] -= 1;
					king[1] -= 1;
				}
				if (king[0] == doll[0] && king[1] == doll[1]) {
					doll[0] += 1;
					doll[1] += 1;
					if (doll[0] > 'H' || doll[1] > '8') {
						king[0] -= 1;
						doll[0] -= 1;
						king[1] -= 1;
						doll[1] -= 1;
					}
				}
			}
			else if (move.equals("LT")) {
				king[0] -= 1;
				king[1] += 1;

				if (king[0] < 'A' || king[1] > '8') {
					king[0] += 1;
					king[1] -= 1;
				}
				if (king[0] == doll[0] && king[1] == doll[1]) {
					doll[0] -= 1;
					doll[1] += 1;
					if (doll[0] < 'A' || doll[1] > '8') {
						king[0] += 1;
						doll[0] += 1;
						king[1] -= 1;
						doll[1] -= 1;
					}
				}
			}
			else if (move.equals("RB")) {
				king[0] += 1;
				king[1] -= 1;

				if (king[0] > 'H' || king[1] < '1') {
					king[0] -= 1;
					king[1] += 1;
				}
				if (king[0] == doll[0] && king[1] == doll[1]) {
					doll[0] += 1;
					doll[1] -= 1;
					if (doll[0] > 'H' || doll[1] < '1') {
						king[0] -= 1;
						doll[0] -= 1;
						king[1] += 1;
						doll[1] += 1;
					}
				}
			}
			else if (move.equals("LB")) {
				king[0] -= 1;
				king[1] -= 1;

				if (king[0] < 'A' || king[1] < '1') {
					king[0] += 1;
					king[1] += 1;
				}
				if (king[0] == doll[0] && king[1] == doll[1]) {
					doll[0] -= 1;
					doll[1] -= 1;
					if (doll[0] < 'A' || doll[1] < '1') {
						king[0] += 1;
						doll[0] += 1;
						king[1] += 1;
						doll[1] += 1;
					}
				}
			}
			else if (move.equals("RT")) {
				king[0] += 1;
				king[1] += 1;

				if (king[0] > 'H' || king[1] > '8') {
					king[0] -= 1;
					king[1] -= 1;
				}
				if (king[0] == doll[0] && king[1] == doll[1]) {
					doll[0] += 1;
					doll[1] += 1;
					if (doll[0] > 'H' || doll[1] > '8') {
						king[0] -= 1;
						doll[0] -= 1;
						king[1] -= 1;
						doll[1] -= 1;
					}
				}
			}
			else if (move.equals("LT")) {
				king[0] -= 1;
				king[1] += 1;

				if (king[0] < 'A' || king[1] > '8') {
					king[0] += 1;
					king[1] -= 1;
				}
				if (king[0] == doll[0] && king[1] == doll[1]) {
					doll[0] -= 1;
					doll[1] += 1;
					if (doll[0] < 'A' || doll[1] > '8') {
						king[0] += 1;
						doll[0] += 1;
						king[1] -= 1;
						doll[1] -= 1;
					}
				}
			}
		}
		System.out.println(king[0] + "" + king[1]);
		System.out.println(doll[0] + "" + doll[1]);
	}
}