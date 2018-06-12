import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int dy[]= {0,0,1,-1};
	static int dx[]= {1,-1,0,0};
	static int n ;
	static int dp[][];
	static int arr[][];
	static boolean judge[][];
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n= Integer.parseInt(br.readLine());
		dp = new int[n][n];
		arr = new int[n][n];
		
		judge = new boolean[n][n];
		
		String a[] = new String[n];
		for(int i=0; i<n; i++) {
			a = br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(a[j]);
				dp[i][j] =1;
			}
		}
		int result = 0;
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				result = Math.max(dfs(i,j),result);
			}
		}
		
//		dfs(0,1);
		
//		for(int i=0; i<n; i++) {
//			
//			for(int j=0; j<n; j++) {
//				System.out.print(dp[i][j]+ " ");
//			} System.out.println();
//		}
		
		System.out.println(result);
		
	}
	
	public static int dfs(int ypos, int xpos) {
//		int x = xpos;
//		int y = ypos;
//		
//		
//			for(int k=0; k<4; k++) {
//				x+=dx[k];
//				y+=dy[k];
////				System.out.println(x+" "+y);
//				if(x<0||y<0||x>=n||y>=n) {
//					continue;
//				}
//				else {
//				if(arr[ypos][xpos]<arr[y][x]) {
//					dp[ypos][xpos] = Math.max(dp[ypos][xpos], dfs(y,x)+1);
//				} else if (arr[ypos][xpos]<arr[y][x]) {
//					dp[ypos][xpos] = Math.max(dp[ypos][xpos], dp[y][x]+1);
//				} 
//				}
//			}
//		
//		judge[ypos][xpos] = true;
//		return dp[ypos][xpos];
		
		if(dp[ypos][xpos]==1) {
	        for (int i =0 ;i<4;i++){
	            int ny = dy[i]+ypos;
	            int nx = dx[i]+xpos;
	            
	            if ( ny < 0 || nx<0 || ny>=n || nx>=n ) continue;
	            if ( arr[ypos][xpos] >= arr[ny][nx] ) continue;
	            	dp[ypos][xpos]= Math.max( dp[ypos][xpos], dfs(ny,nx)+1 );
	            } 
	            
	        }
		judge[ypos][xpos]=true;
	    return dp[ypos][xpos];
	}
}
