package Labsheet_06;

public class RunLL {

	public static void main(String[] args) {
		LinkedList LL=new LinkedList();
		LL.addFirst(11);
		LL.addFirst(3);
		LL.addFirst(4);
		LL.addFirst(5);
		System.out.println("list of elements");
		LL.traverse();
		System.out.println();
		System.out.println("Deleting element is "+LL.removeFirst()); 	 	
		System.out.println("list of elements");
		LL.traverse();
		System.out.println();
		System.out.println("First element is "+LL.viewFirst());
		LL.addLast(98);
		LL.addLast(20);
		LL.addLast(21);
		System.out.println("list of elements");
		LL.traverse();
		System.out.println();
		System.out.println("Deleting element is "+LL.removeLast());
		LL.traverse();
		}

	}

