class Change {


    public int change(int total, int[] coins) {

        int[] dp = new int[total+1];        
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++) {
            for(int j = coins[i]; j <= total; j++) {
                dp[j] = dp[j] + dp[j-coins[i]];
           }
        } 

        return dp[total];
    }



    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        Change c = new Change();

      int[] coins0 = { 1 };
        int[] coins = { 2,4 };

      System.out.println(c.change(10, coins));
    }
}
