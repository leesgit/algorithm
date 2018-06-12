import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = line(br.readLine());
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	private static String line(String line) {
		int size = line.length();
		int cnt =0;
		for(int i=0; i<size; i++) {
			if(line.charAt(i)=='(') {
				cnt++;
			} else if(line.charAt(i)==')') {
				cnt--;
			}
			
			if(cnt==-1) {
				return "NO";
			}
		}
		
		if(cnt==0) {
			return "YES";
		} else {
			return "NO";
		}
		
		
	}