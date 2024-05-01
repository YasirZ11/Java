package Labsheet_06;

public class LinkedList {
	private Node head;
	private int size;

	public LinkedList() {
		head=null;
		size=0;
	}
	
	public boolean isEmpty() {
		return(head==null);
	}

	public int size() {
		return size;
	}
	
	public void addFirst(int item) {
		head=new Node(item,head);
		size++;
	}
	
	int viewFirst() {
		
		if(isEmpty()) {
			System.out.print("List is empty");
			System.exit(1);
		}
			return head.data;
	}
	
	int removeFirst() {
		if(isEmpty()) {
			System.out.print("List is empty");
			System.exit(1);
		}
			int a=head.data;
			head=head.next;
			size--;
			return a;
		}
	
		void traverse() {
			Node PTR=head;
			while (PTR!=null) {
				System.out.print(PTR.data+" ");
				PTR=PTR.next;
			}
		}
		
	public void addLast(int item) {
		size++;
		Node last= head;
		
			for(int i=0;i<size;i++) {
				if(last.next==null) 
					last.next=new Node(item,null);
				else
					last=last.next;
				}
			}
	
	int removeLast() {
		Node last=head;
		int a=0,count=0;
		for(int i=0;i<size;i++) {
				if(last.next==null) {
					a=last.data;
					count=i;
				}
				
				else
					last=last.next;
		}
		
			last=head;
			for(int j=0;j<count-1;j++) {
				last=last.next;
			}
			
			last.next=null;
			size--;
			return a;
	}
}

