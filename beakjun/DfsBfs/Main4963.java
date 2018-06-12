import java.util.Scanner;

public class Main {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int w =0;
		int h =0;
		int count[] = new int[100];
		int k=0;
		int island[][];
		
		
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
		
			if(w==0&&h==0) {
				break;
			}
			
			island = new int[h][w];
	
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					island[i][j] = sc.nextInt();
				}
			}
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(island[i][j]==1) {
						dfs(island,w,h,i,j);
						count[k]++;
					}
				}
			}
			k++;
		}
		
		for(int i=0; i<k; i++) {
			System.out.println(count[i]);	
		}
		
	}
	
	public static void dfs(int[][] island, int w ,int h,int y, int x) {
		final int dx[] = {-1,-1,-1,0,0,0,1,1,1};
		final int dy[] = {-1,0,1,-1,0,1,-1,0,1};
		island[y][x] =0;

		for (int i=0; i<9; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0&&ny>=0&&nx<w&&ny<h) {
				if(island[ny][nx]==1) {
					dfs(island,w,h,ny,nx);
				}
			}
		}
	}

}