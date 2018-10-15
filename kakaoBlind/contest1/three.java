import java.util.ArrayList;
import java.util.List;

class Solution {
  public int solution(int cacheSize, String[] cities) {
      int time =0;
        List<String> check = new ArrayList<String>();

        for(int i=0; i<cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }

        for(int i=0; i<cities.length; i++) {
            if(check.contains(cities[i])==true) {
                check.remove(cities[i]);
                check.add(cities[i]);
                time +=1;
            } else {
                if(cacheSize==0) {

                } else if(check.size()<cacheSize) {
                    check.add(cities[i]);
                }
                else {
                    check.remove(0);
                    check.add(cities[i]);

                }
                time+=5;
            }
        }

        return time;
  }
}