	package Labsheet_04;

	import java.util.Scanner;
	public class Check_Parantheses {
		public static String s;
	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your parentheses");
		s=in.nextLine();
		System.out.println("Parentheses is "+check());
		}
		static boolean check()
		{
		StackChar p=new StackChar(50);
		 for(int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if(c == '[' || c == '(' || c == '{' ) {     
	               p.push(c);
	            } else if(c == ']') {
	                if(p.isEmpty() || p.pop() != '[') {
	                    return false;
	                }
	            } else if(c == ')') {
	                if(p.isEmpty() || p.pop() != '(') {
	                    return false;
	                }           
	            } else if(c == '}') {
	                if(p.isEmpty() || p.pop() != '{') {
	                    return false;
	                }
	            }

	        }
	        return p.isEmpty();
	    }
	}