package assignment1;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        //1.Assignment One
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to reverse: ");
        reverseWord(sc.nextLine());
    }

    static void reverseWord(String word){
        String name = word;
        StringBuilder reverse = new StringBuilder();

        Scanner sc = new Scanner(System.in); //scanner for user input

        //1.creating stack
        Stack stack = new Stack();
        stack.createStack(name.length());

        //2.push char elements from name into stack
        for(int i = 0; i < name.length(); ++i) {
            char ch = name.charAt(i);
            stack.push(ch);
        }

        //3.adding char elements for stack into StringBuilder.
        while(!stack.isEmpty()) {
            char element = stack.pop();
            reverse.append(element);
        }

        System.out.println("String: "+name+"\nreverse: "+reverse.toString());
    }
}
