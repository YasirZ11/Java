package Labsheet_06;

public class RunSLL {

	public static void main(String[] args) {
		StackL st=new StackL();
		st.push(11);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(98);
		st.push(20);
		st.push(21);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println("List of element ");
		
		int a=st.L.size;
			for(int i=0;i<a;i++){
				System.out.print(st.pop()+" ");
		}
	}

}
