import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		String arr[] = br.readLine().replace(",", "").split(" ");
		String m = arr[0];
		int d = Integer.parseInt(arr[1]);
		int y = Integer.parseInt(arr[2]);
		int hour = Integer.parseInt(arr[3].split(":")[0]);
		int min = Integer.parseInt(arr[3].split(":")[1]);

		boolean chk = false;
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
			chk = true;// 2.29
		}

		int[] arrI;
		int[] arrI1 = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] arrI2 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int totTime = 0;
		int nowTime = 0;
		int mCnt = 0;
		
		String[] arrS = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		if (chk) {
			arrI = arrI1;
			totTime = 527040;
		} else {
			arrI = arrI2;
			totTime = 525600;
		}

		for (int i = 0; i < arrS.length; i++) {
			if (m.equals(arrS[i])) {
				break;
			}
			mCnt += arrI[i];
		}
		d += mCnt-1;
		nowTime = (min + (hour * 60) + (d * 24 * 60) )* 100; 
//		int a = nowTime / totTime;
//		nowTime %=totTime;
//		String xx = String.valueOf((double)nowTime/totTime).replace("0.", "");
//		sb.append(a+"."+xx);
		sb.append((double)nowTime/totTime);
		System.out.println(sb);
	}
}
