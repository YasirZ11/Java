package Labsheet_05;

public class PriorityQueueInt {
	
	int arr[];
	int size, rear,front;
	
	PriorityQueueInt(int s){
		size=s;
		arr= new int [s];
		front=rear=-1;
	}
	
	int peek() {
		return arr[front];
	}
	
	boolean isEmpty() {
		return (rear==-1);
	}
	
	boolean isFull() {
		return (rear==size-1);
	}
	
	void enqueue(int a)	{
		if(isFull()){
			System.out.println("Queue is full");
			System.exit(1);
	}
		
		if(front==-1){
			front=0;
		}
		
		if(rear==-1){
			rear=0;
			arr[rear]=a;
	}
		
		else{
			if(a<arr[rear])
				arr[++rear]=a;
			
			else{
				for(int i=0;i<=rear;i++){
					
					if(a>arr[i]){
						int c=rear+1;
						
					while(c!=i){		
						arr[c]=arr[c-1];
						c--;
					}
	
					arr[i]=a;
					rear++;
					break;
					}
				}
			}
		}
	}
		
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			System.exit(1);
		}
	
			int a=arr[front];
			for(int i=0; i<rear;i++)	{
				
				arr[i]=arr[i+1];
			}
	
			rear--;
			return a;
		}
	}