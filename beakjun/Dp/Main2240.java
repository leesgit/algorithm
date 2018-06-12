import java.util.Scanner;

public class Main {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int dp[][][] = new int[n+1][m+2][2];
		int c[] = new int[n+1];
		for(int i=1; i<n+1; i++) {
			c[i] = sc.nextInt();
		}
		
		if(c[0]==1) {
			dp[0][0][0] = 1;	
		}
		else if (c[0]==2) {
			dp[0][0][1] = 1;
		}
		
		for(int i=1; i<=n; i++) {
				for(int j=1; j<m+2; j++) {
						if(c[i]==1) {
							dp[i][j][0] = Math.max(dp[i-1][j][0] + 1, dp[i - 1][j-1][1] + 1); 
							dp[i][j][1] = Math.max(dp[i-1][j-1][0], dp[i - 1][j][1]);
							
						}
						else if(c[i]==2) {
							dp[i][j][0] = Math.max(dp[i-1][j-1][1], dp[i-1][j][0]); 
							dp[i][j][1] = Math.max(dp[i-1][j-1][0] + 1, dp[i-1][j][1] + 1);
						}
				}
		}
		int max=0;
		for(int i =0; i<n; i++) {
			for (int j=0; j<m+1; j++) {
				if(dp[i][j][0]>max) {
					max=dp[i][j][0];
				}
				
				if(dp[i][j][1]>max) {
					max=dp[i][j][1];
				}
			}
		}
		
		System.out.println(Math.max(dp[n][m+1][0], dp[n][m][1]));
//		System.out.println(max);
		
	}
}