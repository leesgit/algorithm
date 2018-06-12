import java.util.Arrays; //테스트로 출력해 보기 위한 코드입니다.

public class BestSet {

    public int[] bestSet(int n, int s){

        int[] answer =null;
        if(n>s) {
           answer = new int[1];
             answer[0]=-1;
            return answer;
        }
          answer = new int[n];
        if(n==1) {
          answer[0] = s;
          return answer;
        }
        int avg = s/n;
        int num = s%n;
        for(int i=n-1; i>=0; i--) {
          if(num!=0) {
                answer[i]=avg+1;
            num--;
          } else {
            answer[i]=avg;
          }
        }
        return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}