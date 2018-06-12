import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		int n = Integer.parseInt(a[0]);
		int m = Integer.parseInt(a[1]);
		double max[] = new double[n];
		double distance =0;
        double x,y =0;
        int o=0;
		String[] temp;
		for(int i=0; i<n; i++) {
			o = Integer.parseInt(br.readLine().trim());
			temp = br.readLine().split(" ");
			for(int j=0; j<o; j++) {
				x=Integer.parseInt(temp[(j*2)]);
				y=Integer.parseInt(temp[(j*2)+1]);
				distance = x*x+y*y;
				if(max[i]<distance) {
					max[i] = distance;
				}
			}
		}
		Arrays.sort(max);
		
		System.out.printf("%.2f",max[m-1]);
	
	}
}