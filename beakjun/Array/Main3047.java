import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[st.countTokens()];
		int size =st.countTokens();
		for(int i=0; i<size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		String letter =br.readLine();
		int a=0;
		int b=0;
		int c=0;
		
		Arrays.sort(arr);
		
		a=arr[0];
		b=arr[1];
		c=arr[2];
		
		for(int i=0; i<3; i++) {
			if(letter.charAt(i)=='A') {
				System.out.print(a+" ");
			}
			
			if(letter.charAt(i)=='B') {
				System.out.print(b+" ");
			}
			if(letter.charAt(i)=='C') {
				System.out.print(c+" ");
			}
		}
		
	}
}
