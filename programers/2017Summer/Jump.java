import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(true) {
           if(n==1) {
                ans++;
                break;
            } else if(n==3) {
                ans+=2;
                break;
            }
            if(n%2==0) {
               n = n/2;
            } else {
                n= n/2;
                ans++;
            }

        }
        return ans;
    }
}