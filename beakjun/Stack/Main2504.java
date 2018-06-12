import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		
		int size = a.length();
		Stack<Character> st = new Stack<Character>();
		int result =0;
		int mul =1;
		for(int i=0; i<size; i++) {
			if(a.charAt(i)=='(') {
				st.push('(');
				mul*=2;
				if(i+1<size) {
					if(a.charAt(i+1)==')')
						result+=mul;
				}
			} else if(a.charAt(i)==')') {
				if(st.isEmpty()) {
					result =0;
					break;
				}
				else if(st.peek()!='(') {
					result =0;
					break;
				} else if(st.peek()=='(') {
					st.pop();
					mul/=2;
				}
			} else if(a.charAt(i)=='[') {
				st.push('[');
				mul*=3;
				if(i+1<size) {
					if(a.charAt(i+1)==']')
						result+=mul;
				}
			} else if(a.charAt(i)==']') {
				if(st.isEmpty()) {
					result =0;
					break;
				}
				else if(st.peek()!='[') {
					result =0;
					break;
				} else if(st.peek()=='[') {
					st.pop();
					mul/=3;
				}
			}
			
		}
		
		if(!st.isEmpty()) {
			result=0;
		}
		System.out.println(result);
	}
	
}