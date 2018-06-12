import java.util.*;

class Pair2 {
    int x;
    int y;
    Pair2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static final int[] dx = {0, 0, 1, -1};
    public static final int[] dy = {1, -1, 0, 0};
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        sc.nextLine();
        for (int i=0; i<n; i++) {
            String s = sc.nextLine();
            for (int j=0; j<m; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }
        
        bfs(n,m,a);
        
        
    }
    
    private static void bfs(int n, int m, int a[][]) {
    	int[][] dist = new int[n][m];
        boolean[][] check = new boolean[n][m];
        Queue<Pair2> q = new LinkedList<Pair2>();
        q.add(new Pair2(0, 0));
        check[0][0] = true;
        dist[0][0] = 1;
        while (!q.isEmpty()) {
            Pair2 p = q.remove();
            int x = p.x;
            int y = p.y;
            for (int k=0; k<4; k++) {
                int nx = x+dx[k];
                int ny = y+dy[k];
                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (check[nx][ny] == false && a[nx][ny] == 1) {
                        q.add(new Pair2(nx, ny));
                        dist[nx][ny] = dist[x][y] + 1;
                        check[nx][ny] = true;
                    }
                }
            }
        }
        System.out.println(dist[n-1][m-1]);
    }
}