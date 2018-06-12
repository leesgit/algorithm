class JumpCase {

  int n1=1;
  int n2=2;
  int n3;
    public int jumpCase(int num) {
        int answer = 0;
                for (int i=0; i<num-2; i++) {
            n3=n1+n2;
          n1= n2;
          n2= n3;
        }
      answer = n3;
        return answer;
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }
}