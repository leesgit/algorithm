
import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Vowels {
	
	public static void main (String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int arr[][] = new int[count][2];
		int size =0;
		String cast;
		
		for(int i=0; i<count; i++) {
			size = Integer.parseInt(br.readLine());
			cast = br.readLine();
			int length =Integer.MAX_VALUE;
			int cnt =0;
			for(int j=0; j<size; j++) {
				if(cast.charAt(j)=='a') {
					for(int k=j; k<size; k++) {
						if(cnt==0&&cast.charAt(k)=='e') {
							cnt++;
						} else if(cnt==1&&cast.charAt(k)=='i') {
							cnt++;
						} else if(cnt==2&&cast.charAt(k)=='o') {
							cnt++;
						} else if(cnt==3&&cast.charAt(k)=='u') {
							if(length>k-j) {
								arr[i][0] = j+1;
								arr[i][1] = k+1;
								length = k-j;
							}
							break;
						}
					}
					cnt=0;
				}
			}
		}
		
		for(int i=0; i<count; i++) {
			System.out.println("Case #"+(i+1));
			if(arr[i][0]==0||arr[i][1]==0) {
				System.out.println("-1 -1");
			} else {
				System.out.println(arr[i][0]+" "+arr[i][1]);
			}
		}
		
	}
	

}

