
	public class ThisRef {
		String name;
		int age;
	
		ThisRef(String name,int age){
			this.name=name;
			this.age=age;
		}
		
		void display() {
			System.out.println("Name: "+name+"\t"+"Age: "+age);
		}
		
	public static void main(String[] args) {
		ThisRef r1=new ThisRef("Stokes",55);
		ThisRef r2=new ThisRef("Smith",49);
		r1.display();
		r2.display();
	}

}
