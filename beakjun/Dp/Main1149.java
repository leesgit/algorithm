import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int dp[][] = new int[n+1][4];
		int min = 0;
		
		for (int i=1; i<n+1; i++) {
			for (int j=1; j<4; j++) {
				dp[i][j] =sc.nextInt();

				if(j==1) {
					dp[i][1] += Math.min(dp[i-1][2], dp[i-1][3]);
				}
				else if(j==2) {
					dp[i][2] += Math.min(dp[i-1][1], dp[i-1][3]);
				}
				else if(j==3) {
					dp[i][3] += Math.min(dp[i-1][1], dp[i-1][2]);
				}
				if(i==n) {
					if(j==1) {
						min = dp[i][j];
					}
					else if(min>dp[i][j]) {
						min=dp[i][j];
					}
				}
			}
		}
		
		System.out.println(min);
	}

}