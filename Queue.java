	package Labsheet_09;

		import java.util.ArrayList;
	
	public class Queue {
		
		public ArrayList<Character> a;
		int front , rear;
		
		Queue(){
			
		front=-1;
		rear=-1;
		a=new ArrayList<>();
		}
		
		public boolean isEmpty() {
			return rear==-1;
		}
		
		public void enqueue(char data) {
			a.add(data);
			if(isEmpty())
				front=rear=0;
			
			else 
				rear++;
		}
		
		public char dequeue() {
			
			rear--;
			return a.remove(front);
		}
		
		public char peek() {
			return a.get(front);
		}
	
	}
