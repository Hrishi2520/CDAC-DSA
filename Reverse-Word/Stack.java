package assignment1;

public class Stack {

    int tos, maxSize;
    char[] st;

    //1.creating stack.
    void createStack(int size) {
        maxSize = size;
        tos = -1;
        st = new char[size];
    }

    //2.pushing Elements in Stack.
    void push(char value) {
        st[++tos]=value;
    }

    //3.popping elements from stack.
    char pop(){
        char temp = st[tos];
        --tos;
        return temp;
    }

    //4.fetching Elements from Stack.
    char peek() {
        return st[tos];
    }

    //5.Function to check whether stack is Full or not.
    boolean isFull() {
        return tos == maxSize-1;
    }

    //6.Function to check whether stack is empty or not.
    boolean isEmpty() {
        return tos == -1;
    }

    //7.Printing Entire Stack Elements.
    void printStack() {
        for (int i = tos; i >=0; i--) {
            System.out.print(st[i]+" ");
        }
    }
}
