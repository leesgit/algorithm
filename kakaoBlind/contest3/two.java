import java.util.ArrayList;

import java.util.List;
class Solution {
        static List<String> dic = new ArrayList<String>();

  public int[] solution(String text) {
       setDic();
        List <String>dic2 = new ArrayList<String>();
        dic2.addAll(dic);
        List<Integer> result = new ArrayList<Integer>();
        int cnt =0;

        A: for(int i=0; i<text.length(); i++) {

            for(int j=i+1; j<=text.length(); j++) {
                String temp = text.substring(i,j);
                if(dic2.contains(temp)) {
                    cnt++;
                    if(j==text.length()) {
                        result.add(dic2.indexOf(temp)+1);
                        break A;
                    }
                } else {
                    dic2.add(temp);
                    result.add(dic2.indexOf(text.substring(i, j-1))+1);
                    if(cnt==0) {
                        break;
                    } else {
                        i+=cnt-1;
                        cnt=0;
                        break;
                    }

                }

            }
        }
        System.out.println(result);
        System.out.println(dic2);
        int arr[] = new int[result.size()];
        for(int i =0; i<arr.length;i++) {
            arr[i] = result.get(i);
        }
      return arr;

    }


    static void setDic() {
        if(dic.size()==0) {
            for(int i=0; i<=25; i++) {
                dic.add(String.valueOf((char)(i+65)));
            }
        }
    }
}