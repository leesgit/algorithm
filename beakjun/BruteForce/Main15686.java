import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int m;
	static boolean back[];
	static int n;
	static int size;
	static List<Point> chickens;
	static List<Point> homes;
	static int input[];
	static int result = Integer.MAX_VALUE;
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int city[][] = new int[n][n];
		input = new int[m];
		chickens = new ArrayList<Point>();
		homes = new ArrayList<Point>();
		for(int i =0; i<n; i++) {
			a=br.readLine();
			st = new StringTokenizer(a, " ");
			for(int j=0; j<n; j++) {
				city[i][j] = Integer.parseInt(st.nextToken());
				if(city[i][j]==1) {
					homes.add(new Point(j, i));
				} else if ((city[i][j]==2)) {
					chickens.add(new Point(j, i));
				}
			}
		}
		back = new boolean[chickens.size()+1];
		size = chickens.size();
		com(0,0);
		System.out.println(result);
		
	}
	
	
	public static void com(int c,int len) {
		if(len==m ) {
            int cnt =0;
            for(int i=1; i<=size; i++) {
                if( back[i] ) {
//                	System.out.print((chickens.get(i-1).y+1)+" "+ (chickens.get(i-1).x+1)+" ");
                	input[cnt] =i-1;
                	cnt++;
                }
            }
            dfs(input);
            
		} else {
			for(int i=c+1; i<=size; i++) {
				if(back[i]==false) {
					back[i]=true;
					com(i, len+1);
				}
			}
		}
		back[c] =false;
	}
	
	public static void dfs(int[] input) {
		int distance[] = new int[homes.size()];
		int min;
		int sum =0;
		for(int i=0; i<homes.size(); i++) {
			min = Integer.MAX_VALUE;
			for(int j=0; j<input.length; j++) {
				
				if(min>Math.abs(homes.get(i).x-chickens.get(input[j]).x)+ Math.abs(homes.get(i).y-chickens.get(input[j]).y)) {
					min = Math.abs(homes.get(i).x-chickens.get(input[j]).x)+ Math.abs(homes.get(i).y-chickens.get(input[j]).y);
				}
			}
			sum += min;
		}
		if(sum<result) {
			result = sum;
		}
		
	}
	
}

	class Point {
		int x;
		int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
