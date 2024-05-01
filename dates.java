	package Exercise;
	
	import java.util.Scanner;

	public class dates {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Today's day 0-6");
		int day= sc.nextInt();
		System.out.println("Enter the number of days elapsed since today");
		int number=sc.nextInt();
		int futureday=(day+number)%7;
		System.out.print("Today is ");
		
		if (day==0)
			System.out.print("Sunday");
		if (day==1)
			System.out.print("Monday");
		if (day==2)
			System.out.print("Tuesday");
		if (day==3)
			System.out.print("Wednesday");
		if (day==4)
			System.out.print("Thursday");
		if (day==5)
			System.out.print("Friday");
		if (day==6)
			System.out.print("Saturday");
	
	System.out.print(" and the future day is ");
	
	switch (futureday) {
	case 0: System.out.print("Sunday");
		break;
	case 1: System.out.print("Monday");
		break;
	case 2: System.out.print("Tuesday");
		break;
	case 3: System.out.print("Wednesday");
		break;
	case 4: System.out.print("Thursday");
		break;
	case 5: System.out.print("Friday");
		break;
	case 6: System.out.print("Saturday");
		break;
	}
}

}