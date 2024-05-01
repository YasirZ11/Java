	package Labsheet_04;

	import java.util.Scanner;

	public class Reverse_Stack {
		static String n ;
		public static void main(String[] args) {
		StackChar s=new StackChar(500);
		System.out.println("Enter strings and end with fullstop");
		Scanner in=new Scanner(System.in);
		n=in.nextLine();
		reverse(s);
		for(int i=0;i<n.length();i++)
		{
		System.out.print(s.pop());
		}
		}
		static void reverse(StackChar a){
		int w=0;
		a.push('.');
		for(int i=0;i<n.length();i++)
		{
		char c=n.charAt(i);
		if(c==' ')
		{
		for(int j=i-1;j>=w;j--)
		{
		a.push(n.charAt(j));
		}
		a.push(' ');
		w=i+1;
		}
		if(c=='.')
		{
		for(int j=i-1;j>=w;j--)
		{
		a.push(n.charAt(j));
		}
		w=i+1;
		}
		}
		}
		}
		
	
		
		