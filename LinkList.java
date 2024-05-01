package Labsheet_06;

public class LinkList {
	
	public class node{
		int data;
		node next;
		
		node(int item, node next){
			data=item;
			this.next=next;
		}
	}
	
		node head,tail;
		int size;
		
		LinkList(){
			head=null;
			tail=null;
			size=0;
		}
		
		boolean isEmpty() {
			return(tail==null);
		}
		
			void addFirst(int item) {
				head = new node(item,head);
				size++;
			
				if(tail==null) {
					tail=head;
				}
			}
			
			int removeFirst() {
				if(isEmpty()) {
					System.out.println("List is empty");
					System.exit(1);
				}
				
				int a=head.data;
				head=head.next;
				size--;
				return a;
			}
			
			int removeLast() {
				int a=tail.data;
				node last=head;
				
				for(int i=1;i<size;i++) {
					last=last.next;
				}
				
				tail=last;
				tail.next=null;
				size--;
				return a;
			}
	}
