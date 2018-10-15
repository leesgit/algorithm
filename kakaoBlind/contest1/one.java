class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] result = new String[arr1.length];
        String num;
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<arr1.length;i++) {
            num = Integer.toBinaryString(arr1[i]|arr2[i]);
            for(int j=num.length(); j<n; j++) {
                sb.append(" ");
            }
            for(int j=0; j<num.length();j++) {

                if(num.charAt(j)=='1'){
                    sb.append("#");
                }
                else {
                    sb.append(" ");
                }
            }
            result[i] = sb.toString();
            sb.delete(0,sb.length());
        }
      return result;
  }
}
