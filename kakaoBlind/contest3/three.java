package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Num3 {
	
	public static void main (String args[]) {
//		String arr[] = {"imh12.png", "img12.png", "img103.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String arr[] = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
//		String arr[] = {"F-3","F-8","A-1"};
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
						if(arr[i].charAt(j-1)>47&&arr[i].charAt(j-1)<58) {
							
						} 
						if(j+1<arr[i].length()) {
							if(arr[i].charAt(j+1)<=47||arr[i].charAt(j+1)>=58) {
								end = j+1;
							} 
						} 
				}
			}
			if(end==0) {
				end=start+1;
			}
//			System.out.println(start+" "+end);
			head = arr[i].substring(0,start);
			num = arr[i].substring(start,end);
			tail = arr[i].substring(end,arr[i].length());

			list.add(new Part(head, num, tail));
//			System.out.println(head +" / "+num+" / "+tail);
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
//				System.out.println(p1.head+" "+p2.head);
				if(p1.head.toLowerCase().compareTo(p2.head.toLowerCase())<0) {
					return -1;
				} 
				else if(p1.head.toLowerCase().compareTo(p2.head.toLowerCase())==0) {
					for(int i=0; i<p1.num.length(); i++) {
						if(p1.num.charAt(i)!='0') {
							idx1 = i;
							break;
						}
					}
					
					for(int i=0; i<p2.num.length(); i++) {
						if(p2.num.charAt(i)!='0') {
							idx2 = i;
							break;
						}
					}
					temp1 =p1.num.substring(idx1,p1.num.length());
					temp2 =p2.num.substring(idx2,p2.num.length());
					System.out.println(temp1+" "+temp2);
					
					if(Integer.parseInt(temp1)<Integer.parseInt(temp2)) {
						return -1;
					} 
				}
				
				return 0;
			}
		});
		
//		System.out.println(list.get(3).head.toLowerCase().compareTo(list.get(1).head.toLowerCase()));
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).head+list.get(i).num+list.get(i).tail);
		}
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
	public Part(String head, String num) {
		super();
		this.head = head;
		this.num = num;
	}
	public Part(String head) {
		super();
		this.head = head;
	}
	
}
