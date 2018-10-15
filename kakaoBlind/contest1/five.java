import java.util.ArrayList;

import java.util.List;
class Solution {
  public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        List<String> list1 = getList(str1);
        List<String> list2 = getList(str2);

        int count =0;
        boolean judge =true;
        for(int i=0; i<list1.size();i++) {
            judge =true;
            for(int j=0; j<list2.size();j++) {
                if(list1.get(i).equals(list2.get(j))&&judge==true) {
                    list2.remove(j);
                    count++;
                    judge =false;
                }
            }
        }
        int ans=0;
        if(list1.size()==0&&list2.size()==0) {
            ans = 65536;
        } else {
            int sum = list1.size()+list2.size();
            ans = (count*65536)/sum;
        }
        return ans;
  }

    private static List<String> getList (String str) {
        List<String> list =new ArrayList<String>(); 
        for(int i=0; i<str.length()-1;i++) {

            if(str.charAt(i)>=97&&str.charAt(i)<=122&&str.charAt(i+1)>=97&&str.charAt(i+1)<=122) {
                list.add(str.substring(i,i+2));
            }
        }
        return list;
    }
}