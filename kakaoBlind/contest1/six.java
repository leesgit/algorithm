class Solution {
  public int solution(int h, int w, String[] block) {

     boolean judge[][] = new boolean[h][w];
        char arr[][] = new char[h][w];
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                arr[i][j] = block[i].charAt(j);
            }
        }
        while(true) {
            boolean check =false;
            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    if(i<h-1&&j<w-1&&arr[i][j]!=0) {
                        if(arr[i][j]==arr[i][j+1]&&arr[i][j]==arr[i+1][j]&&arr[i][j]==arr[i+1][j+1]) {
                            judge[i][j] = true;
                            judge[i][j+1] = true;
                            judge[i+1][j] = true;
                            judge[i+1][j+1] = true;
                            check = true;
                        }
                    }
                }
            }

            if(check) {
                for(int i=0; i<h; i++) {
                    for(int j=0; j<w; j++) {
                        if(judge[i][j]==true) {
                            arr[i][j] =0;
                        }
                    }
                }

                for(int i=h-1; i>-1; i--) {
                    for(int j=0; j<w; j++) {
                        if(arr[i][j]==0) {
                            int cnt =1;
                            A: while(true) {
                                if(i-cnt==-1) {
                                    break A;
                                }

                                if(arr[i-cnt][j]!=0) {
                                    arr[i][j]=arr[i-cnt][j];
                                    arr[i-cnt][j]=0;
                                    break A;
                                } else {
                                    cnt++;
                                }

                            }
                        }
                    }
                }

                judge = new boolean[h][w];

            } else {
                break;
            }
        }
        int answer =0;
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                if(arr[i][j]!=0) {
                    answer++;
                }
            }
        }
        answer = h*w-answer;
        return answer;
  }
}