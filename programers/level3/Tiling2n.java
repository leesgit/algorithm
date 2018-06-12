class TryHelloWorld {
    public int tiling(int n) {
        int answer = 0;
    int[] dp = new int[10000];
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 3;

    for(int i=4; i<n+1; i++) {
        dp[i] = (dp[i-1]%100000+dp[i-2]%100000)%100000;
    }

        return dp[n];
    }

    public static void main(String args[]) {
        TryHelloWorld tryHelloWorld = new TryHelloWorld();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.print(tryHelloWorld.tiling(4));
    }
}