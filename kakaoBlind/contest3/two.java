package test3;

import java.util.ArrayList;
import java.util.List;

public class Num2_3 {
	
	static List<String> dic = new ArrayList<String>();
	
	public static void main (String args[] ) {
		setDic();
//		solution("TOBEORNOTTOBEORTOBEORNOTTOBERRTOBER");
		solution("TOBEORNOTTOBEORTOBEORNOT");
		System.out.println();
		solution("KAKAO");
	}
	
	public static void solution(String text) {
		List <String>dic2 = new ArrayList<String>();
		dic2.addAll(dic);
		List<Integer> result = new ArrayList<Integer>();
		
A:		for(int i=0; i<text.length(); i++) {
			
			for(int j=i+1; j<=text.length(); j++) {
				String temp = text.substring(i,j);
				if(dic2.indexOf(temp)>=0) {
					if(j==text.length()) {
						if(temp.length()==2) {
							result.add(dic2.indexOf(temp)+1);
						} else {
							result.add(dic2.indexOf(text.charAt(text.length()-1)+"")+1);
						}
						break A;
					}
				} else {
					dic2.add(temp);
					result.add(dic2.indexOf(text.substring(i,j-1))+1);
					i+=temp.length()-2;
					break;
				}
				
			}
		}
		System.out.println(dic2);
		System.out.println(result);
		
		
	}
	
	static void setDic() {
		for(int i=0; i<=25; i++) {
			dic.add(String.valueOf((char)(i+65)));
		}
	}

}
