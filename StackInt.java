package Labsheet_04;

public class StackInt {

	int stackArray[];
	int size;
	int top;

public StackInt(int S) {
	size=S;
	stackArray=new int[size];
	top=-1;
}

int peek() {
	if(isEmpty()){
	return 0;
	}
	
	else
	return  stackArray[top];
}

int size() {
	return size;
	}

boolean isEmpty() {
	return top==-1;
}

boolean isFull() {
	return top==size-1;
}

void push(int a) {
	if (isFull()) {
		System.out.println("Stack is Full");
		System.exit(1);
	}
	
	stackArray[++top]=a;
}

int pop() { 	
	if (isEmpty()) {
		System.out.println("Stack is Full");
		System.exit(1);
	}
	return (int) stackArray[top--];
}
	

}
