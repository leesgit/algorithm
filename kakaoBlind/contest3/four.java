import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.text.ParseException;

class Solution {
  public String solution(String m, String[] musicInfo) throws ParseException{
    		 String answer = "(None)";
			int max = -1;
			m = m.replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("G#", "g").replace("A#", "a");
			 for(int i=0; i<musicInfo.length; i++) {
				StringTokenizer st = new StringTokenizer(musicInfo[i],",");
				
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
					long startTime = simpleDateFormat.parse(st.nextToken()).getTime();
					long endTime = simpleDateFormat.parse(st.nextToken()).getTime();
					int runningTime = (int) ((endTime-startTime)/60000);
					String title = st.nextToken();
					String melody = st.nextToken();
					melody =melody.replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("G#", "g").replace("A#", "a");
					String temp = melody;
					
					if(melody.length()<runningTime) {
						int cnt = runningTime/melody.length();
						for(int k=1; k<cnt; k++) {
							melody+=temp;
						}
						int remainder = runningTime - temp.length()*cnt;
						melody+=temp.substring(0,remainder);

					} else {
						melody=melody.substring(0, runningTime);
					}
//					System.out.println("melody : "+ melody+" , length"+melody.length());
					
					
					if(melody.length()<m.length()) {
						continue;
					} else if(melody.length()==m.length()) {
						if(melody.equals(m)) {
							answer = title;
							break;
						} else {
							continue;
						}
					}
					
					if(melody.contains(m)) {
                        if(runningTime>max) {
                        	max = runningTime;
                        	answer = title;
                        }
					}
				
			}
      return answer;
  }
}