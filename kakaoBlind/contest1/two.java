package test1;

import java.util.Arrays;

public class two_dat {
	public static void main (String args[] ) {
		two_dat dat = new two_dat();
		int result =dat.dat("1D2S#10S");
		System.out.println(result);
	}
	
	public int dat (String info ) {
		int[] num = new int[info.length()];
		String[][] simbol = new String[info.length()][info.length()];
		String tempNum[] = info.split("[^0-9]");
		String tempCal[] = info.split("[0-9]",-2);
		for(int i=0; i<tempNum.length; i++) {
			System.out.println(tempNum[i]);
		}
		for(int i=0; i<tempCal.length; i++) {
			System.out.println(tempCal[i]);
		}
		int scount =0;
		int ncount =0;
		
		String str = info;      
	    str = str.replaceAll("[^-?0-9]+", " "); 
	    String s[] = str.trim().split(" ");
	    for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
	    
	    System.out.println();
		
		boolean count = false;
		String temp = "";
		for (int i=0; i<info.length();i++) {
			if(info.charAt(i)=='0'||info.charAt(i)=='1'||info.charAt(i)=='2'||info.charAt(i)=='3'||info.charAt(i)=='4'||
					info.charAt(i)=='5'||info.charAt(i)=='6'||info.charAt(i)=='7'||info.charAt(i)=='8'||info.charAt(i)=='9') {
				if(count) {
					ncount--;
					num[ncount] =num[ncount]*10+ Integer.parseInt(info.charAt(i)+"");
				}
				else {
					num[ncount] =num[ncount]*10+ Integer.parseInt(info.charAt(i)+"");
				}
				ncount++;
				count=true;
			}
			else {
				simbol[ncount-1][scount]=info.charAt(i)+"";
				scount++;
				count=false;
			}
		}
		
		int sum = 0;

		for(int i=0; i<ncount;i++) {
			for (int j=0; j<scount; j++) {
//				System.out.println(i+":"+simbol[i][j]);
				
				if(simbol[i][j]!=null) {
				if(simbol[i][j].equals("D")) {
					num[i] = num[i]*num[i];
				}
				else if (simbol[i][j].equals("T")) {
					num[i] = num[i]*num[i]*num[i];
				}
				else if (simbol[i][j].equals("#")) {
					num[i] *=-1;
				}
				else if (simbol[i][j].equals("*")) {
					for (int k=0; k<i+1;k++) {
						num[i-k] *=2;
					}
				}
				}
			}
		}
		for (int i=0;i<ncount; i++) {
//			System.out.println(num[i]);
			sum +=num[i];
		}
		return sum;
	}
	

}
