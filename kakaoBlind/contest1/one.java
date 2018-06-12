package test1;

public class one_bomool_bit {
	
	public static void main (String[] args) {
		int n=5;
		int[] arr1= {9, 20, 28, 18, 11};
		int arr2[] = {30, 1, 21, 17, 28};
		String temp;
		for(int i=0; i<arr1.length; i++) {
			temp = Integer.toBinaryString(arr1[i]);
			System.out.println(temp);
			temp = Integer.toBinaryString(arr2[i]);
			System.out.println(temp);
			temp = Integer.toBinaryString(arr1[i]&arr2[i]);
			System.out.println(temp);
			temp = Integer.toBinaryString(arr1[i]|arr2[i]);
			System.out.println(temp);
			System.out.println();

		}
		
		String[] result = new String[arr1.length];
		String num;
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<arr1.length;i++) {
			num = Integer.toBinaryString(arr1[i]|arr2[i]);
			for(int j=0; j<arr1.length;j++) {
				
				if(num.charAt(j)=='1'){
					sb.append("#");
				}
				else {
					sb.append(" ");
				}
			}
			System.out.println(sb.toString());
			sb.delete(0,sb.length());


		}

	}
}
