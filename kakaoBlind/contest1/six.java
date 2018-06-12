package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class six_friends {
	
	public static void main (String agrs[]) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<ArrayList<String>> groupList = new ArrayList<ArrayList<String>>();
		ArrayList<String> list = new ArrayList<String>();
		String temp =null;
		int[][] deleteNum = new int[m][n];
		String[] temps = new String[m];
		
		for(int i=0; i<m; i++) {
			temps[i] =sc.next();
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				list.add(temps[m-i-1].substring(j,j+1));
			}
			groupList.add(list);
			list = new ArrayList<String>();
		}
		
		int count =0;
		for(int i=0; i<groupList.size()-1; i++) {
			for (int j=0; j<groupList.get(i).size()-1; j++) {
				if(groupList.get(i).get(j).equals(groupList.get(i+1).get(j))&&
						groupList.get(i).get(j).equals(groupList.get(i+1).get(j+1))&&
						groupList.get(i).get(j).equals(groupList.get(i).get(j+1))) {
				
				}
			}
		}
		
		System.out.println(groupList.size());
		System.out.println(groupList.get(0).remove(0));
		System.out.println(groupList.get(0).size());
		System.out.println(groupList.get(1).size());
		System.out.println("/");

	}

}
