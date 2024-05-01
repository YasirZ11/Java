package Labsheet_06;

public class CircularLinkedList {

	public class Node {
		int data;
		Node next;
		
		Node(int item){
		data=item;
		this.next=null;
		}
	
	}
	
		Node head,tail;
		int size;
		
		CircularLinkedList(){
		head=null;
		tail=null;
		size=0;
	}
		
		boolean isEmpty(){
		return tail==null;
	}
		
		void view(){
		Node p=head;
		
		do{
		System.out.print(p.data+" ");
		p=p.next;
	}
		
		while(p!=head);
		System.out.println();
	}
	
		void addFirst(int item){
		Node n=new Node(item);
			if(isEmpty()){
				n.next=n;
				head=n;
				tail=n;
		}
			
			else{
				n.next=head;
				head=n;
				tail.next=head;
		}
	
			size++;
		}
		
		void addLast(int item){
		Node n=new Node(item);
			if(isEmpty()){
				n.next=n;
				head=n;
				tail=n;
			}
		
			else{
				tail.next=n;
				tail=n;
				tail.next=head;
		}
				
			size++;
		}
		
		int removeFirst(){
		int a=head.data;
		head=head.next;
		tail.next=head;
		size--;
		return a;
		}
		
		int removeLast(){
		int a=tail.data;
		Node last=head;
			for(int i=1; i<size-1;i++)	{
				last=last.next;
		}
			
			tail=last;
			tail.next=head;
			return a;
		}
	}

