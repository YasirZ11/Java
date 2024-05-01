	package Labsheet_04;

	public class Find_Maximum {
		
		int max(Stack a) {
			int max= a.pop(); 
		while (!a.isEmpty()) {
			if(max>a.peek())
				a.pop();
			else
				max=a.pop();
		}
		
			return max;
		}
		
		
	public static void main(String[] args) {
		
		Find_Maximum m= new Find_Maximum();
		
		Stack s=new Stack(9);
			s.push(5);
			s.push(25);
			s.push(35);
			s.push(15);
			s.push(45);
			
			System.out.println("Maximum Value: "+ m.max(s));
	}

}
