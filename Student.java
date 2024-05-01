import java.util.Scanner;

public class student {
	 String[] name;
	 void getData() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Students Name");
		 String[] name= new String[10]	;	 
		  
		 for(int i=0; i<10;i++) {
			 name[i]=sc.next();
		 }
	 }
		 
	 void display(){
		 for(int i=0; i<10;i++) {
			
			System.out.println("Students Name : "+name[i]);
		 }
 }
		
	public static void main(String[] args) {
		
		student s=new student();
		s.getData();
		s.display();
	}

}
