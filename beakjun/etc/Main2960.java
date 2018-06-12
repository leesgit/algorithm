import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int numbers[] = new int[n+1];
		int cnt=0;
		int judge =0;
A:		for(int i=2; i<=n; i++) {
			if(numbers[i]!=-1) {
				numbers[i] = -1;
				judge++;
			}
			cnt =1;
			if(judge==m) {
				System.out.println(i*cnt);
				break;
			}
			while(true) {
				if(i*cnt<=n&&numbers[i*cnt] != -1) {
					numbers[i*cnt] = -1;
					judge++;
//					System.out.println(i*cnt);
					if(judge==m) {
						System.out.println(i*cnt);
						break A;
					}
				} else if(i*cnt>n) {
					break;
				}
				cnt++;
			}
		}
	}

}
