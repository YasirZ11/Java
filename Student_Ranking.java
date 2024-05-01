package Labsheet_05;

import java.util.Scanner;

public class Student_Ranking {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("No of student's data you want to enter");
		int count=in.nextInt();
		
		PriorityQueueInt p=new PriorityQueueInt(count);
		System.out.println("Enter students name with marks");
		String name[]=new String[count];
		int marks[]=new int[count];
		
			for(int i=0;i<count;i++){
			name[i]=in.next();
			marks[i]=in.nextInt();
			}
			
			for(int i=0;i<count;i++){
			p.enqueue(marks[i]);
			}
		
			for(int i=0;i<count;i++){
					int a=p.dequeue();
				for(int j=0;j<count;j++){
					if(a==marks[j])
				{
						System.out.println((i+1)+" - "+name[j]+"\tmarks - "+marks[j]);
					}
				}
			}
		}
	}
		
