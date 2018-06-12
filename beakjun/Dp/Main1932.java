import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int[][] list;
	public static void main (String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, tmp = 0;
        list = new int[n + 1][n + 1];
        int max =0;
        
        
//        for (int i=1; i<n+1; i++) {
//        	for (int j=1; j<i+1; j++) {
//        		list[i][j]=sc.nextInt();
//
//        		
//        	}
//        }
        
        for (int i=1; i<n+1; i++) {
        	for (int j =1; j<i+1; j++) {
        		list[i][j]=sc.nextInt();

        		if(j==1) {
        			list[i][j] = list[i-1][j]+list[i][j];
        		}
        		else if (j==i) {
        			list[i][j] = list[i-1][j-1]+list[i][j];
        		}
        		else {
        			list[i][j] = Math.max(list[i-1][j-1], list[i-1][j])+list[i][j];
        		}
        		if(i==n) {
        			if(max<list[i][j]) {
        				max=list[i][j];
        			}
        		}
        	}
        }
       System.out.println(max); 
       
    }	

}