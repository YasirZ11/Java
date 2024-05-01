package Labsheet_06;

public class RunQLL {

	public static void main(String[] args) {
		QueueL q= new QueueL();
		
		q.Enqueue(11);
		q.Enqueue(3);
		q.Enqueue(4);
		q.Enqueue(5);
		q.Enqueue(98);
		q.Enqueue(20);
		q.Enqueue(21);
		
		System.out.println(q.peek());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.peek());
		
		System.out.println("List of element ");
		
		int a=q.L.size;
			for(int i=0;i<a;i++){
				System.out.print(q.Dequeue()+" ");
			}
	}

}
