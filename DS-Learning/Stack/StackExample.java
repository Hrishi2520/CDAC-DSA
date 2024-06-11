package lecture;

import java.util.Scanner;

public class StackExample {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Stack st = new Stack();

        System.out.println("Enter size number for stack: \n");
        int size = sc.nextInt();
        st.create_stack(size);
        int choice;
        do{
            System.out.println("1.Push | 2.Pop | 3.Peek | 4.Print | 0.Exit:\n");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 :
                    if (!st.is_full()) {
                        st.push(sc.nextInt());
                    } else{
                        System.out.println("Stack is full..");
                    } break;
                case 2 :
                    if (!st.is_Empty()) {
                        System.out.println(st.peek()+" is popped");
                        st.pop();
                    } else {
                        System.out.println("Stock is empty..");
                    } break;
                case 3 :
                    if(!st.is_Empty()) {
                        System.out.println("Element: "+st.peek());
                    } else {
                        System.out.println("Stock is empty..");
                    }break;
                case 4 :
                    if(!st.is_Empty()) {
                        System.out.println("Elements in stack are: ");
                        st.printStack();
                    } break;
                case 0 : System.out.println("Thanks for using code , coded by Hrishikesh");break;
                default:
                    System.out.println("Wrong option selected..");break;
                }
        } while (choice != 0);
    }
}
