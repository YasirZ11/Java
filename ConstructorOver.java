
	public class ConstructorOver {
		String name="Rahul";
		int age=27;
		
		 ConstructorOver(String n,int a){
			 name=n;
			 age=a;
		 }
		 ConstructorOver(int a,String n){
			age=a;
			name=n;
		 }
		 ConstructorOver(int a){
				age=a;
		 }
		 ConstructorOver(String n){
				name=n;
		 }
		 	void display() {
		 		System.out.println("Name: "+name+"\t"+"Age: "+age);
		 	}
	public static void main(String[] args) {
		ConstructorOver o1=new ConstructorOver("Kumar",11);
		ConstructorOver o2=new ConstructorOver("Mahela");
		ConstructorOver o3=new ConstructorOver(29);
		ConstructorOver o4=new ConstructorOver(7,"Mahi");
		o1.display();
		o2.display();
		o3.display();
		o4.display();
	}
}
