import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		int size = str.length();
		int[] num = new int[size];
		int temp=0;
		for(int i=0;i<size;i++){
			num[i] = Character.getNumericValue(str.charAt(i));
		}
		
		for(int i=0;i<size;i++){
			for(int j=i;j<size;j++){
				if(num[i]<num[j]){
					temp = num[i];
					num[i]= num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i:num) System.out.print(i);
	}
}