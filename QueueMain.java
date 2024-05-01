package Labsheet_05;

import java.util.Scanner;

public class QueueMain {
	int items[];
    int i, front = 0, rear = 0, itemnum, item, count = 0;

    	Scanner sc=new Scanner(System.in);
    void getdata() {
        try {
            System.out.println("Enter the Limit :");
            itemnum=sc.nextInt();
            items = new int[itemnum];
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    void enqueue() {
        try {
            if (count < itemnum) {
                System.out.println("Enter Queue Element :");
                item= sc.nextInt();
                items[rear] = item;
                rear++;
                count++;
            } else {
                System.out.println("Queue Is Full");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    void dequeue() {
        if (count != 0) {
            System.out.println("Deleted Item :" + items[front]);
            front++;
            count--;
        } else {
            System.out.println("Queue Is Empty");
        }
        if (rear == itemnum) {
            rear = 0;
        }
    }

    void display() {
        int m = 0;
        if (count == 0) {
            System.out.println("Queue Is Empty");
        } else {
            for (i = front; m < count; i++, m++) {
                System.out.println(" " + items[i]);
            }
        }
    }
}

