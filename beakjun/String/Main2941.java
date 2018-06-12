import java.util.Scanner;

public class Main {
	
	public static void main (String args[]) {
		String arr[] = {"c=","c-", "d-", "lj", "nj", "s=","dz=", "z="};
		boolean cnt[] = new boolean[arr.length];
		int length[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			length[i] = arr[i].length();
		}
		Scanner sc = new Scanner(System.in);
		String Letter = sc.next();
		int size = Letter.length();
		int size2 = Letter.length();
		String[] bf;
		int c = 0;
		int ans =0;
		int cal =0;
		String result = "";
		String i6 ="";
		int i6count =0;
		boolean judge = false;
		for(int i=0; i<arr.length; i++) {
			bf =Letter.split(arr[i]);
			for(int j=0; j<bf.length; j++) {
				result+=bf[j];
			}
			if(i==6&&result.length()!=size) {
				judge=true;

			}
			if(size !=result.length()&&i6count==0) {
				cal +=size-result.length();
				ans+=((size-result.length())/length[i]);
				if(judge) {
					i6count +=((size-result.length())/length[i])*2;
				}
			} else if (size !=result.length()+i6count&&i6count>0) {
				cal +=size-result.length()-i6count;
				ans+=((size-result.length()-i6count)/length[i]);

			} 
			result = "";
			
		}
		cal = size -cal;
		System.out.println(ans+cal);
	}

}