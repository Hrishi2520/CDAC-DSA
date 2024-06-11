package LinkedList;

import java.util.Scanner;

public class LinkedListMenu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LinearLinkedList list = new LinearLinkedList();
        list.createList();
        int choice;
        do {
            System.out.println("1.insert_left | 2.delete_left | 3.insertRight | 4.delete_right | 5.print_list | 6.search_list | 0.Exit: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter value to add left: ");
                    list.insert_left(sc.nextInt());
                    break;
                case 2:
                    list.delete_left();
                    System.out.println("left Item Deleted..");
                    break;
                case 3:
                    System.out.println("Enter value to add rigth: ");
                    list.insertRight(sc.nextInt());
                    break;
                case 4:
                    list.delete_right();
                    System.out.println("Right Item Deleted..");
                    break;
                case 5:
                    System.out.println("Items in Linked List: ");
                    list.print_list();
                case 6:
                    System.out.println("Enter value to search: ");
                    list.search_list(sc.nextInt());
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
