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

    // ������ ���� main�Դϴ�.
    public static void main(String[] args) {
        CorrectParenthesis cp = new CorrectParenthesis();
        if(cp.parenthesisCase(3).equals(new BigInteger("5")))
        {
            System.out.println("parenthesisCase(3)�� ���� �����մϴ�. ������ ������ �ٸ� ��쿡�� �������� Ȯ���� ������.");
        }
        else
        {
            // System.out.println(parenthesisCase(3));
        }
    }
}
