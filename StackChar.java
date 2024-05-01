package Labsheet_04;

public class StackChar {
	char arr[];
	int top,size;
		StackChar(int s){
			size=s;
			arr=new char[size];
			top=-1;
	
	}
	
		boolean isEmpty(){
			return top==-1;
	}
	
		boolean isFull(){
			return top==size-1;
	}

		char peek(){
			if(isEmpty()){
			System.out.println("Stuck is empty");
			System.exit(1);
	}
	
			return arr[top];
		}
	
			void push(char a){
				if(isFull())
			{
					System.out.println("Stuck is full");
					System.exit(1);
	}
				
				arr[++top]=a;}
	
				char pop(){
					if(isEmpty())
				{
						System.out.println("Stuck is empty");
						System.exit(1);
	}
					
					return arr[top--];
				}
	}