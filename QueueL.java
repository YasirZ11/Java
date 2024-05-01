package Labsheet_06;

public class QueueL {
	LinkList L=new LinkList();
	
	int peek() {
		return L.tail.data;
	}
	
	void Enqueue(int item) {
		L.addFirst(item);
	}
	
	int Dequeue() {
		return L.removeFirst();
	}
}
