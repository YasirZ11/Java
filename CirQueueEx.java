package Labsheet_05;

public class CirQueueEx {

	public static void main(String[] args) {
		CircularQueueInt q=new 	CircularQueueInt(5);
		q.enqueue(11);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(98);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(21);
		q.enqueue(22);
		int a=q.size();
		for(int i=0;i<a;i++)
		{
		System.out.print(q.dequeue()+" ");
		}
		}
	}

