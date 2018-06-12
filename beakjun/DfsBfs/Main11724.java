	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Queue;
	import java.util.Scanner;
	
	public class Main {
		static List<Integer> [] arr;
		static boolean[] judge;
		
		public static void  bfs (int x) {
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(x);
			judge[x]=true;
			while(!q.isEmpty()) {
				int a = q.remove();
	
				for (int y : arr[a]) {
					if(judge[y]==false) {
						judge[y]=true;
						q.add(y);
					}
				}
			}
			
		}
		
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int p = sc.nextInt();
			int l = sc.nextInt();
			
			arr =  new ArrayList[p+1];
			judge = new boolean[p+1];
			int u;
			int v;
			
			for (int i=1; i<=p; i++) {
				arr[i] = new ArrayList<Integer>();
	        }
			for(int i=0; i<l; i++) {
				u= sc.nextInt();
				v= sc.nextInt();
				arr[u].add(v);
				arr[v].add(u);
			}
			int cnt =0;
			
			for(int i=1; i<p+1; i++) {
				if(judge[i]==false) {
					bfs(i);
					cnt++;
				}
			}
			
			System.out.println(cnt);
			
		}
	
	}
