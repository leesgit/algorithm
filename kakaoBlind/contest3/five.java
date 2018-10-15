import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
  public String[] solution(String[] arr) {
        List<Part> list = new ArrayList<>();
        String head;
        String num;
        String tail="";

        int start=0;
        int end=0;

        for(int i=0; i<arr.length; i++) {

            for(int j=0; j<arr[i].length(); j++) {


                if(arr[i].charAt(j)>47&&arr[i].charAt(j)<58) {
                        if(start==0) {
                            start=j;
                        }

                        if(j+1<arr[i].length()) {
                            if(arr[i].charAt(j+1)<=47||arr[i].charAt(j+1)>=58) {
                                end = j+1;
                                break;
                            } 
                        } 
                }

            }
            if(end==0) {
                end=arr[i].length();
            }
//          System.out.println(start+" "+end);
            head = arr[i].substring(0,start);
            num = arr[i].substring(start,end);
            tail = arr[i].substring(end,arr[i].length());

            list.add(new Part(head, num, tail));
//          System.out.println(head +" / "+num+" / "+tail);
            start=0;
            end=0;
        }

        Collections.sort(list, new Comparator<Part>() {


            int idx1=0;
            int idx2=0;
            String temp1 ="";
            String temp2 ="";
            @Override
            public int compare(Part p1, Part p2) {
//              System.out.println(p1.head+" "+p2.head);
                if(p1.head.toLowerCase().compareTo(p2.head.toLowerCase())<0) {
                    return -1;
                } 
                else if(p1.head.toLowerCase().compareTo(p2.head.toLowerCase())==0) {

                    if(Integer.parseInt(p1.num)<Integer.parseInt(p2.num)) {
                        return -1;
                    } else if(Integer.parseInt(p1.num)>Integer.parseInt(p2.num)) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
                return 1;
            }
        });

//      System.out.println(list.get(3).head.toLowerCase().compareTo(list.get(1).head.toLowerCase()));
        String answers[] = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
            // System.out.println(list.get(i).head+list.get(i).num+list.get(i).tail);
            answers[i] = list.get(i).head+list.get(i).num+list.get(i).tail;
        }
      return answers;
  }
}

class Part {
    String head;
    String num;
    String tail;
    public Part(String head, String num, String tail) {
        super();
        this.head = head;
        this.num = num;
        this.tail = tail;
    }
}