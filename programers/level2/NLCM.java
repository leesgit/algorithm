class NLCM {
    public long nlcm(int[] num) {
            int size = num.length;
            long r =1;
            long val1,val2;
            long lcm;
            val1 = num[0];
            for(int i=1; i<size; i++)  {
            val2 = num[i];

            long tmp1=val1;
            longtmp2=val2;
            if(val1<val2){
                val1 = tmp2;
                val2 = tmp1;
             }

             while(r>0){
                 r = val1 % val2;
                 val1 = val2;
                 val2 = r;
              }
             lcm = tmp1* tmp2/val1;
             val1 = lcm;
             r=1;
            }
            return val1;
    }

    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex = { 2, 6, 8, 14 };
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
    }
}
