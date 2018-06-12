class Solution {
    public int solution(int sticker[]) {
         int answer = 0;
         int dp[] = new int[sticker.length];
         int dp2[] = new int[sticker.length];

         if(sticker.length>4) {
         dp[0] = sticker[0];
         dp[1] = sticker[1];
         dp[2] = sticker[0]+sticker[2];
         int a = Math.max(dp[1], dp[2]);

         dp2[1] = sticker[1];
         dp2[2] = sticker[2];
         dp2[3] = sticker[1]+sticker[3];
         int b = Math.max(dp2[2], dp2[3]);

         answer = Math.max(a, b);


         for(int i=3; i<sticker.length; i++) {

             if(i<sticker.length-1) {
                 dp[i] = Math.max(dp[i-2], dp[i-3])+sticker[i];
                 if(dp[i]>answer) {
                     answer = dp[i];
                 }
             }
             if(i>3) {
                 dp2[i] = Math.max(dp2[i-2], dp2[i-3])+sticker[i];

                 if(dp2[i]>answer) {
                     answer = dp2[i];
                 }
             }

         }
         } else if(sticker.length==3) {
             answer= Math.max(sticker[0], Math.max(sticker[1], sticker[2]));
         } else if(sticker.length==2) {
             answer = Math.max(sticker[0],sticker[1]);
         } else {
             answer = sticker[0];
         }

         return answer;
    }
}
