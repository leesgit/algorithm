class TryHelloWorld
{
    public int nextBigNumber(int n)
    {
        String binary = Integer.toBinaryString(n);
        // int i = Integer.parseInt(binary);
        // System.out.println(i);
        int b[] = new int[binary.length()];
        char t;
        String k;
        int j;
        for(j=1; j<binary.length()+1;j++) {
            t =binary.charAt(binary.length()-j);
            k = Character.toString(t);
            b[j-1]= Integer.parseInt(k);
            // System.out.println(b[j-1]);
        }
       j=0;
      int l=0;

        while(j<binary.length()+1) {
            if(j+1<binary.length()&&b[j]==1&&b[j+1]==0) {
            b[j]=0;
                b[j+1]=1;
            while (l<j) {
              if(b[l]==0&&b[l+1]==1) {
                b[l]=1;
                b[l+1]=0;
              }
              l++;
             }
            break;
         }
          j++;
        }

      int ii=5;
      int answer = 0;
      for(int q=0; q<b.length; q++) {
       // System.out.println(b[q]); 
        if(b[q]==1) {
        answer+= Math.pow(2,q);
        }
      }
        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int n = 100;
        System.out.println(test.nextBigNumber(n));
    }
}
