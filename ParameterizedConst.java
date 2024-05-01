
	public class ParameterizedConst {
		String name;
		int age;
	
		ParameterizedConst(String n, int i){
			name=n;
			age=i;
		}
		
		void display() {
			System.out.println("Name: "+name+"\t"+"Age: "+age);
		}

	public static void main(String[] args) {
		ParameterizedConst a1=new ParameterizedConst("Ram",22);
		ParameterizedConst a2=new ParameterizedConst("Jaanu",20);
		
		a1.display();
		a2.display();
	}
}
