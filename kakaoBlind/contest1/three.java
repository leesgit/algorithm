package test1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_cache {

    public static void main(String[] args) {
        int CACHE_TIME = 1;
        int NONE_CACHE_TIME = 5;
        int[] cacheSizes = {3,3,2,5,2,0};

        List<List> citiesList = new ArrayList();
        citiesList.add(Arrays.asList(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        citiesList.add(Arrays.asList(new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
        citiesList.add(Arrays.asList(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        citiesList.add(Arrays.asList(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        citiesList.add(Arrays.asList(new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
        citiesList.add(Arrays.asList(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));

        for(int i=0; i<citiesList.size(); i++){
            int cacheSize = cacheSizes[i];

            List<String> cache   = new ArrayList<String>();
            List<String> arrCity = citiesList.get(i);

            int delayTime = 0;
            
            for(String city : arrCity) {
            	if(cache.contains(city.toLowerCase())) {
            		delayTime += CACHE_TIME;
            	}
            	else {
                    delayTime += NONE_CACHE_TIME;
                    if(cacheSize!=0&&cache.size() > cacheSize-1){
                        cache.remove(0);
                    }
                    cache.add(city.toLowerCase());

            	}
            	
            }
            
            
            System.out.println("캐시크기 : " + cacheSize + ", 도시이름 : " + arrCity.toString() + ", 실행시간 : " + delayTime);
        }
    }
}