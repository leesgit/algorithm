import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		Stack<Character> st = new Stack<Character>();
		int result =0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='(') {
				st.push(a.charAt(i));
				
			} else if(a.charAt(i)==')') {
				st.pop();
				if(a.charAt(i-1)=='('&&st.size()>0) {
					result+=st.size();
				} else if(a.charAt(i-1)!='('){
					result+=1;
				}
			}
		}
		
		System.out.println(result);
	}

}