package Labsheet_06;

public class RunCL {

	public static void main(String[] args) {
	
			CircularLinkedList l=new CircularLinkedList();
			l.addFirst(11);
			l.addFirst(3);
			l.addFirst(4);
			l.addFirst(5);
			System.out.println("list of elements");
			l.view();
			System.out.println();
			l.addLast(98);
			l.addLast(20);
			System.out.println("list of elements");
			l.view();
			System.out.println();
			System.out.println("Deleting element is "+l.removeFirst());
			System.out.println("list of elements");
			l.view();
			System.out.println();
			System.out.println("Deleting element is "+l.removeLast());
			System.out.println("list of elements");
			l.view();

	}

}
