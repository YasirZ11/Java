	package Labsheet_04;

	import java.util.Scanner;

	public class Evaluate_Postfix {
		static String a; 
	public static void main(String[] args) {
			System.out.println("Enter the postfix: ");
			StackInt s=new StackInt(45);
			Scanner sc= new Scanner(System.in);
			a=sc.next();
			 
		        for(int i=0;i<a.length();i++)
		        {
		            char c=a.charAt(i);
		             
		            if(Character.isDigit(c))
		            s.push(c - '0');
		             
		            else
		            {
		                int val1 = s.pop();
		                int val2 = s.pop();
		                 
		                switch(c)
		                {
		                    case '+':s.push(val2+val1);break;
		                     
		                    case '-':s.push(val2- val1);break;
		                     
		                    case '/':s.push(val2/val1);break;
		                     
		                    case '*':s.push(val2*val1);break;
		              }
		            }
		   } 
		        System.out.println("Postfix evaluation is: "+ s.pop());

	}
					
	}


	
	