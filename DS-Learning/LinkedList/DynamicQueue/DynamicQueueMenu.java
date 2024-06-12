package LinkedList.dynamic_queue;

import java.util.Scanner;

public class DynamicQueueMenu {
    public static void main(String[] args) {
        int ch;
        Scanner in = new Scanner(System.in);
        DynamicQueue obj = new DynamicQueue();
        obj.create_queue();//user given size :stack
        do {
            System.out.println("1.Enqueue | 2.Dequeue | 3.Print | 0.Exit:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter data to insert:");
                    int e = in.nextInt();
                    obj.enqueue(e);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    System.out.println("Data in queue");
                    obj.print_queue();
                    break;
                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        } while (ch != 0);
    }
}
