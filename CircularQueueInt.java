package Labsheet_05;

public class CircularQueueInt {
	
	int arr[];
	int size,rear,front;
	
	CircularQueueInt(int s){
		size=s;
		arr= new int [s];
		front=-1;
		rear=-1;
		}
	
	int peek(){
	if(rear==-1){
		System.out.println("queue is empty");
		System.exit(1);
		}
	
		return arr[rear];
		}
		
		int size(){
	
			if(rear<front)
				return ((size-(front-rear))+1);
	
			else if(rear>front)
				return (rear-front+1);
			else if(front==rear && front!=-1)
				return 1;
			else
				return 0;
		}
		
		boolean isEmpty(){
			return size()==0;
		}
		
		boolean isFull()
		{
			
			return size()==size;
		}
		
		void enqueue(int a){
			if(isFull()){
				System.out.println("Queue is full");
				System.exit(1);
			}
	
			if(front==-1)
				front=0;
			if(rear==size-1)
				rear=0;
			else
				rear++;
			arr[rear]=a;
			}
		int dequeue()	{
			int a=0;
			if(isEmpty()){
				System.out.println("Queue is empty");
				System.exit(1);
			}
			
			a=arr[front];
			if(front==rear){
				front=-2;
				rear=-1;
			}
	
				front++;
			if(front==size)
				front=0;
			return a;
		}
	}