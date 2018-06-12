import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main (String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int arr[] = new int[n];
		int dp[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = 1;
		int max =dp[0];
		for(int i=1; i<n; i++) {
			for(int j=i-1; j>=0; j--) {
				if(arr[i]>arr[j]) {
					if(dp[j]>dp[i]) {
						dp[i] = dp[j];
					}
				}
			}
			dp[i]++;
			if(dp[i]>max) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}

}
