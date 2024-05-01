package Labsheet_05;

public class priQueueEx {

	public static void main(String[] args) {
		PriorityQueueInt q=new PriorityQueueInt(8);
			q.enqueue(32);
			q.enqueue(57);
			q.enqueue(45);
			q.enqueue(28);
			q.enqueue(77);
			q.enqueue(92);
			q.enqueue(83);
			q.enqueue(66);
		System.out.println("Priority queue is: ");
		int a=q.rear;
		for(int i=0;i<=a;i++){
		System.out.print(q.dequeue()+" ");
		}
	}

	}


