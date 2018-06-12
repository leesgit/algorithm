import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		int n = a.length();
		String arr[] = new String[n];
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				sb.append(a.charAt(j));
			}
			arr[i] = sb.toString();
			sb = new StringBuffer();
		}
		
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}