import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main (String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		StringBuffer sb =new StringBuffer();
		
		for(int i=0; i<n; i++) {
			arr[i] =br.readLine();
//			System.out.println(arr[i]);
		}
		boolean judge = true;
		for(int i=0; i<arr[0].length(); i++) {
			judge = true;
			for(int j=0; j<n-1; j++) {
				if(arr[j].charAt(i)!=arr[j+1].charAt(i)) {
					sb.append("?");
					judge=false;
					break;
				}
			}
			if(judge) {
				sb.append(arr[0].charAt(i));
			}
		}
		
		System.out.println(sb);
	}

}