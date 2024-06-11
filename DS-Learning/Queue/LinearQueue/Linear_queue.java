package queue;

public class Linear_queue {
    int[] q;
    int maxsize;
    int front;
    int rear;

    void createQueue(int size) {
        maxsize = size;
        front = 0;
        rear = -1;
        q = new int[maxsize];
    }

    void enqueue(int i) {

        q[++rear] = i;
    }

    boolean isFull() {
        return rear == maxsize - 1;
    }

    boolean isEmpty() {
        return front > rear;
    }

    int dequeue() {
        int temp = q[front];
        front++;
        return temp;
    }

    void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}
