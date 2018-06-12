import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
	
	public static void main (String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String num[] = br.readLine().split(" ");
		int nums[] = new int[n];
		int dp[] = new int[n];
		int max =0;
		for(int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(num[i]);
			if(i==0) {
				dp[0] = nums[0];
				max = nums[0];
			} else {
				dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
				if(dp[i]>max) {
					max = dp[i];
				}
			}
		}
		
		System.out.println(max);
	}

}