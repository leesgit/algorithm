import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] wine = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			wine[i] = sc.nextInt();
		}
		long[][] dp = new long[n + 1][4];
		dp[1][1] = wine[1];
		long max = wine[1];

		for (int i = 2; i <= n; i++) {
			dp[i][1] = dp[i - 1][3] + wine[i];	
			dp[i][2] = dp[i - 1][1] + wine[i];	
			dp[i][3] = Math.max(Math.max(dp[i - 1][1], dp[i - 1][2]), dp[i - 1][3]);	

			max = Math.max(Math.max(Math.max(dp[i][1], dp[i][2]), dp[i][3]), maxValue);
		}

//		for (int i = 1; i <= 3; i++) {
//			for (int k = 1; k <= n; k++) {
//				System.out.printf("%6d", dp[k][i]);
//			}
//			System.out.println();
//		}

		System.out.println(max);
	}			
}