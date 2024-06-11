package assignment1;

import java.util.Scanner;

public class BalanceOfControl {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Pattern: ");
        balance(sc.nextLine());
    }

    static void balance(String pattern) {
        //creating stack
        Stack stack = new Stack();
        stack.createStack(pattern.length());

        //pushing elements in stack
        for(char ch : pattern.toCharArray()) {
            if (ch == '{' || ch == '}') stack.push(ch);
        }
        //printing the stack.
        stack.printStack();

        int count = 0;      //calculate reps of '}'
        for (int i = stack.tos; i >= 0; --i) {
            if (stack.st[i] == '}') {
                ++count;
                stack.pop();
            }
        }

        // number of '{' in stack
        int size = stack.tos;

        if (size+1 == count) System.out.println("Balanced");
        else if (size == count) System.out.println("Error:Expected");
        else System.out.println("Error:UnExpected");
    }
}
