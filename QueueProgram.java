package Labsheet_05;

import java.util.Scanner;

public class QueueProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int choice;
	        QueueMain que = new QueueMain();
	        que.getdata();
	        System.out.println("Queue\n\n");
	        try {
	            do {
	                System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n");
	                System.out.println("Enter the Choice : ");
	                choice=sc.nextInt();
	   
	                switch (choice) {
	                    case 1:
	                        que.enqueue();
	                        break;
	                    case 2:
	                        que.dequeue();
	                        break;
	                    case 3:
	                        que.display();
	                        break;
	                }
	            } while (choice != 4);
	        } catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        }
	    }
}
