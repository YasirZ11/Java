package Labsheet_05;

public class QueueExample {

	public static void main(String[] args) {
			
		QueueInt q= new QueueInt(4);
		
		q.enqueue(11);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(4);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		int a=q.size();
		for(int i=0;i<=a;i++)
		{
		System.out.println("Removed Element: "+ q.dequeue()+" ");
	
		}
	}

}
