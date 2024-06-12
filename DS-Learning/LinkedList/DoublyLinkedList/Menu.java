package LinkedList.doubly_linked_list;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int ch, e;
        Scanner in = new Scanner(System.in);
        Doubly_Linked_List obj = new Doubly_Linked_List();
        obj.create_list();//user given size :list
        do {
            System.out.println("1.Insert Left | 2.Insert Right | 3.Delete Left | 4.Delete Right | 5.Print List | 0.Exit:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    obj.insert_left(e);
                    break;
                case 2:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    obj.insert_right(e);
                    break;
                case 3:
                    obj.delete_left();
                    break;
                case 4:
                    obj.delete_right();
                    break;
                case 5:
                    obj.print_list();
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
