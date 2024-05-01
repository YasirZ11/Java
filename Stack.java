	package Labsheet_09;

	import java.util.ArrayList;

	public class Stack {
		
		public ArrayList<Character> a=new ArrayList<>();
		public int top;
		
		public Stack() {
			top=-1;
		}
		
		public void push(char start) {
			a.add(start);
			top++;
		}
		
		public char pop() {
			return a.remove(top--);
		}
	
		public boolean isEmpty() {
			return top==-1;
		}
		
		public char peek() {
			return a.get(top);
		}
	
}
