import java.math.BigInteger;

class CorrectParenthesis
{
    public BigInteger parenthesisCase(int n)
    {
        BigInteger answer = new BigInteger("0");
    BigInteger factory = new BigInteger("1");
    BigInteger factory2 = new BigInteger("1");
    BigInteger factory3 = new BigInteger("1");
    for(int i=2; i<=2*n; i++) {
      if(i<=n) {
            factory =factory.multiply(BigInteger.valueOf(i));
      } 
      factory2 = factory2.multiply(BigInteger.valueOf(i));
    }
    factory3 = factory.multiply(BigInteger.valueOf(n+1));
    factory3 = factory3.multiply(factory);
    answer = factory2.divide(factory3);

        return answer;
    }

    // 실행을 위한 main입니다.
    public static void main(String[] args) {
        CorrectParenthesis cp = new CorrectParenthesis();
        if(cp.parenthesisCase(3).equals(new BigInteger("5")))
        {
            System.out.println("parenthesisCase(3)이 정상 동작합니다. 제출을 눌러서 다른 경우에도 정답인지 확인해 보세요.");
        }
        else
        {
            // System.out.println(parenthesisCase(3));
        }
    }
}
