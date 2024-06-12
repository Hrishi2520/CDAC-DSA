package LinkedList.Dynamic;

import java.util.Scanner;

public class DynamicStackMenu {
    public static void main(String[] args)
    {
        DynamicStack obj=new DynamicStack();
        Scanner in=new Scanner(System.in);
        int choice,e;
        obj.create_stack();//init stack with other details
        do
        {
            //menu
            System.out.println("1.Push | 2.Pop | 3.Peek | 4.Print | 0.Exit:");
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter a number:");
                    e=in.nextInt();
                    obj.push(e);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    System.out.println("Elements in stack are\n");
                    obj.print_stack();
                    break;
                case 0:
                    System.out.println("Thanks for using code..");
                    break;
                default:
                    System.out.println("Wrong option selsected:");
                    break;
            }

        }while(choice!=0);
    }
}