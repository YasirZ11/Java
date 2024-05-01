package Labsheet_06;

public class StackL {
	LinkList L= new LinkList();
	
	int peek() {
		return L.head.data;
	}
	
	void push(int item) {
		L.addFirst(item);
	}
	
	int pop() {
		return L.removeFirst();
	}
}
