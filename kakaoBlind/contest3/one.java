package test3;

public class Num1 {
	
	public static void main (String args[]) {
//		tento(233,8)
		System.out.println(tento(2,2));
		System.out.println(tento2(16,16,2,1));
	}
	private static String tento2 (int n, int t, int m, int p) {
		int num=0;
		String result = "";
		String ans = "";
//		if(n==2) {
			for(int i=0; i<t*m; i++) {
				result = result+tento(i,n);

			}
//		}
		System.out.println(result);
		for(int i=0; i<t; i++) {
			ans += result.charAt(p-1)+"";
			p+=m;
		}
		
		return ans;
	}
	
	private static String tento (int n, int jb) {
		String result ="";
		int num=0;
		String temp ="";
		if(jb==2) {
			while(true) {
				result = n%2+result;
				n/=2;
				if(n==0) {
					break;
				}
			}
		} else if(jb==16) {
			while(true) {
				num =n%16;
				if(num>9) {
					if(num==10) {
						temp = "A";
					} else if(num==11) {
						temp = "B";
					} else if(num==12) {
						temp = "C";
					} else if(num==13) {
						temp = "D";
					} else if(num==14) {
						temp = "E";
					} else if(num==15) {
						temp = "F";
					}
				} else {
					temp = num+"";
				}
				result = temp+result;
				n/=16;
				if(n==0) {
					break;
				}
			}
		}
		return result;
	}

}
