	package Labsheet_04;

import java.util.Scanner;

public class Sort_Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int num=sc.nextInt();
		StackInt s1=new StackInt(num);
		
		System.out.println("Enter the elements: ");
		
		for (int i=0; i<num;i++) {
			s1.push(sc.nextInt());
		
		}
		
		StackInt s2=new StackInt(num);
		s2.push(s1.pop());
		
		while(s1.top!=-1)
		{
		int tem=0;
		if(s1.peek()>s2.peek())	{
		s2.push(s1.pop());
		}
		
		else {
		tem=s1.pop();
		s1.push(s2.pop());
		s1.push(tem);
		
		}
		}
		
		System.out.println("Sorting in desending order");
		for(int i=0;i<num;i++){
		System.out.print(s2.pop()+" ");
	
		}
		
		}
		}