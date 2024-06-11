package lecture;

public class Stack {

    int s[], tos, maxsize;

    void create_stack(int size) {
        maxsize=size;
        tos=-1;
        s=new int[maxsize];
    }

    void push(int i) {
        tos++;
        s[tos]=i;
        //s[++tos]=i;
    }

    boolean is_full(){
        return tos == maxsize - 1;
    }

    int pop(){
        int temp = s[tos];
        tos--;
        return temp;
    }

    boolean is_Empty(){
        return tos == -1;
    }

    int peek(){
        return s[tos];
    }

    void printStack(){
        for (int i= tos; i >=0; i--) {
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
