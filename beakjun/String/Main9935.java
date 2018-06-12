import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		StringBuffer sb = new StringBuffer();
		Stack<Character> st = new Stack<Character>();
		for(int i = a.length()-1; i>=0; i--) {
			st.push(a.charAt(i));
			if(st.size() >= b.length() &&st.peek()==b.charAt(0)) {
				if(b.length()==1) {
					st.pop();
				}
				for(int j=1; j<b.length(); j++) { 
					if(st.size()-1-j<0) {
						break;
					}
					if(st.get(st.size()-1-j)!=b.charAt(j)) {
						break;
					} 
					
					if(j==b.length()-1) {
						for(int k=0; k<b.length();k++) {
							st.pop();
						}
					}
					
				}
			
			}
		}
		int size =st.size();
		if(size ==0) {
			System.out.println("FRULA");
		} else {
		for(int i=0; i<size;i++) {
			sb.append(st.pop());
		}
		System.out.println(sb);
		}
		
	}

	

}
