import java.util.Scanner;



class Main{
	
    static int[] dp;
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num[] = new int[n+1];
        
        for(int i=1; i<n+1; i++) {
        	num[i] = sc.nextInt();
        }
        
        dp = new int[n+1];
        Main bottom_up = new Main();
        bottom_up.makeBread(n, num);
        System.out.println(dp[n]);
    }

    public int makeBread(int n, int num[]){

    	dp[0]=0;
    	for(int i=1; i<num.length; i++) {
    		for(int j=i; j<n+1; j++) {    	
    			dp[j]=dp[j]>dp[j-i]+num[i] ? dp[j]:dp[j-i]+num[i];
    			
    		}
    	}
    	
        return dp[n];

    }

}