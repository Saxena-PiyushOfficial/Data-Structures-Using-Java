package Basic_DSA;

import java.util.Stack;

public class validParenthesis {
	 private static boolean isMatching(char open, char close) {
	        return (open == '(' && close == ')') ||
	               (open == '[' && close == ']') ||
	               (open == '{' && close == '}');
	    }
	public static void main(String[] args) {
		 String str = "[(){()}]";
	        char[] arr = str.toCharArray();
	        Stack<Character> st = new Stack<>();

	        for (char c : arr) {
	            if (c == '(' || c == '[' || c == '{') {
	                st.push(c);
	            } else if (c == '}' || c == ']' || c == ')') {
	                if (!st.isEmpty() && isMatching(st.peek(), c)) {
	                    st.pop();
	                } else {
	                    System.out.println("Not balanced");
	                    return;
	                }
	            }
	        }

	        if (st.isEmpty()) {
	            System.out.println("Balanced");
	        } else {
	            System.out.println("Not balanced");
	        }
	}

}
