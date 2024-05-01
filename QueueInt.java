package Labsheet_05;

public class QueueInt {

		int [] arr;
		int size;
		int front;
		int rear;
		
		QueueInt(int s){
			size=s;
			arr= new int[s];
			front=-1;
			rear=-1;
		}
		
		int peek() {
			return arr[front];
		}
		
	 boolean isFull() {
		 return rear==size-1;	 
	 	}
	 
	 boolean isEmpty() {
		return (front<0 || front>rear);
	 	}
	 	 void enqueue(int a) {
		 if(isFull()) {
			System.out.println("Queue overflow");
			System.exit(1);
		 	}
		 
		 if (front==-1)
			 front++;
		 
		 arr[++rear]=a;
	 	}
	 
	 int dequeue() {
		 
		 if(isEmpty()) {
			 System.out.println("Queue underflow");
			 System.exit(1);
		 	}
		 return arr[front++];
	 	}
	 
	 int size() {
		 return rear - front;
	 }
}
