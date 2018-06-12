class Solution {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int num=0;
        int person =0;
A:      for(int i=1; i<words.length; i++) {
            if(words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)) {
                num =i+1;
                break;
            }
            for(int j=0; j<i; j++) {
                if(words[i].equals(words[j])) {
                    num = i+1;
                    break A;
                }
            }
        }
        if(num!=0) {
            person =num%n;
            if(person ==0) {
                answer[0]= n;
                answer[1] = num/n;
            } else {
                answer[0] +=person;
                answer[1] = num/n+1;
            }
        }

        return answer;
    }
}