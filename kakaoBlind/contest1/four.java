import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution {
  public String solution(int n, int t, int m, String[] time) {

        int[] timeInt = new int[time.length];
        String ct;
        int c;
        for(int i=0; i<time.length;i++) {
            ct = time[i];
            ct=ct.replace("01:", "1:");
            ct=ct.replace("02:", "2:");
            ct=ct.replace("03:", "3:");
            ct=ct.replace("04:", "4:");
            ct=ct.replace("05:", "5:");
            ct=ct.replace("06:", "6:");
            ct=ct.replace("07:", "7:");
            ct=ct.replace("08:", "8:");
            ct=ct.replace("09:", "9:");
            ct=ct.replace(":", "");
            timeInt[i]=Integer.parseInt(ct);
        }
        Arrays.sort(timeInt);
        List<Integer> ka =new ArrayList<Integer>();

        for(int i=0;i<timeInt.length;i++) {
            ka.add(timeInt[i]);
        }
        ka.add(9999);



        int[] departure=new int[n];
        int[] times =new int[n];


        int anw = 0;
        int hour=0;
        int minute=0;

        departure[0]=900;

        int tn =t;
        for(int i=1; i<n;i++) {
            hour = t/60;
            minute = t%60;
            times[i]=hour*100+minute;
            t+=tn;
            departure[i] =900+times[i];
        }

        for (int i=0; i<n;i++) {
            for (int j=0;j<m;j++) {
                if(ka.size()-1==0) {
                    anw=departure[n-1];
                }
                else if(ka.get(0)<=departure[i]) {
                    if((i==n-1&&j==m-1)) {
                        if(ka.get(0)<=departure[n-1]) {
                            anw =ka.get(0)-1;
                        }
                        else {
                            anw=departure[n-1];
                        }
                    }
                    else if(m>ka.size()) {
                        anw=departure[n-1];
                    }
                    ka.remove(0);
                }
                else {
                    anw=departure[n-1];
                }

            }
        }
        if(anw%100==99) {
            anw= anw-40;
        }
        String answer = Integer.toString(anw);
        if(answer.length()==1) {
            answer="000"+answer;
        }
        else if(answer.length()==2) {
            answer="00"+answer;
        }
        else if(answer.length()==3) {
            answer="0"+answer;
        }

        answer = answer.substring(0,2)+":"+answer.substring(2);

        return answer;
  }
}
