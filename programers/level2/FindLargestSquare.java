class TryHelloWorld
{
    public int findLargestSquare(char [][]board)
    {
        int answer = 0;
        int min=0;
        int[][] dp = new int[board.length+1][board[0].length+1];

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
            if(board[i][j]=='O') {
                dp[i+1][j+1]=1;
            }
            else {
                dp[i+1][j+1]=0;
            }
          }
        }

      for(int i=1; i<board.length+1; i++) {
            for(int j=1; j<board[0].length+1; j++) {
            if(dp[i][j]==1&&dp[i-1][j]>=1&&dp[i-1][j-1]>=1&&dp[i][j-1]>=1) {
              min =dp[i-1][j];
              if(dp[i-1][j-1]<min) {
                min=dp[i-1][j-1];
              }
              if(dp[i][j-1]<min) {
                min=dp[i][j-1];
              }
              dp[i][j]=min+1;
                if(dp[i][j]>answer) {
                answer =dp[i][j];
              }
            }
          }
        }

        return answer*answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
                char [][]board ={
                {'X','O','O','O','X'},
                {'X','O','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','X','X','X'},
                {'X','X','X','X','X'}};

        System.out.println(test.findLargestSquare(board));
    }
}