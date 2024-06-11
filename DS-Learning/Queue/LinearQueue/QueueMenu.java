package queue;

import java.util.Scanner;

public class QueueMenu {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Linear_queue queue = new Linear_queue();
        System.out.println("Enter size number for Queue: \n");
        queue.createQueue(sc.nextInt());
        int choice;
        do {
            System.out.println("1.enqueue | 2.dequeue | 3.print:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (!queue.isFull()) {
                        queue.enqueue(sc.nextInt());
                    } else {
                        System.out.println("Queue is full..");
                    }
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        queue.dequeue();
                    } else {
                        System.out.println("Queue is empty..");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Elements in Queue are: ");
                        queue.printQueue();
                    }
                    break;
                case 0:
                    System.out.println("Thanks for using code , coded by Hrishikesh");
                    break;
                default:
                    System.out.println("Wrong option selected..");
                    break;
            }
        } while (choice != 0);
    }
}
