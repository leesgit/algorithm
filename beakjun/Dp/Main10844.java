import java.util.Scanner;

public class Main {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		long dp[][] = new long[n+1][10];
		
		for(int i=1; i<=9; i++) {
			dp[1][i]=1;
		}
		
		for(int i=2; i<n+1; i++) {
			for(int j=0; j<=9; j++) {
				if(j+1<=9) {
					dp[i][j]+= dp[i-1][j+1];
				}
				if(j-1>=0) {
					dp[i][j]+= dp[i-1][j-1];
				}
				
				dp[i][j]%=1000000000;
			}
		}
		
		long ans=0;
		for(int i=0; i<=9;i++) {
			ans+=dp[n][i];
		}
		ans%=1000000000;
		System.out.println(ans);
		
	}

}