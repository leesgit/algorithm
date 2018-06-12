class Solution {
    public int solution(int n, int[] stations, int w) {
            int answer = 0;   

            if(stations.length>1) {
                for(int i=0; i<stations.length; i++) {
                    if(i==0) {
                        if(stations[i]-w-1>2*w+1) {
                            answer+= (stations[i]-w-1)/(2*w+1);
                            if((stations[i]-w-1)%(2*w+1)!=0) {
                                answer++;
                            }
                        } else if(stations[i]-w>1) {
                            answer++;
                        }
                    }  else { 
                        if(stations[i]-w-(stations[i-1]+w)-1>2*w+1) {
                            answer+= (stations[i]-w-(stations[i-1]+w)-1)/(2*w+1);
                            if((stations[i]-w-(stations[i-1]+w)-1)%(2*w+1)!=0) {
                                answer++;
                            }
                        } else if(stations[i]-w-(stations[i-1]+w)-1>0) {
                            answer++;
                        }
                    }
                    if(i==stations.length-1) { 
                        if(n>stations[i]+w) {
                            if(n-(stations[i]+w)>2*w+1) {
                                answer+= (n-(stations[i]+w))/(2*w+1);
                                if((n-(stations[i]+w))%(2*w+1)!=0) {
                                    answer++;
                                }
                            } else {
                                answer++;
                            }
                        }

                    }
                }
            } else { 
                if(stations[0]-w-1>2*w+1) {
                    answer+= (stations[0]-w-1)/(2*w+1);
                    if((stations[0]-w-1)%(2*w+1)!=0) {
                        answer++;
                    }  
                } else if(stations[0]-w>1) {
                    answer++;
                }
                if(n>stations[0]+w) {
                    if(n-(stations[0]+w)>2*w+1) {
                        answer+= (n-(stations[0]+w))/(2*w+1);
                        if((n-(stations[0]+w))%(2*w+1)!=0) {
                            answer++;
                        }
                    } else {
                        answer++;
                    }
                }
            }  
            return answer;
        }
}
