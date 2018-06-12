import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		int point = a.length()/2;
		
		boolean judge = true;
		for(int i=0; i<point; i++) {
			if(a.charAt(i)!= a.charAt(a.length()-i-1)) {
				judge = false;
				break;
			}
		}
		int result =judge?1:0;
		System.out.println(result);
	}

}