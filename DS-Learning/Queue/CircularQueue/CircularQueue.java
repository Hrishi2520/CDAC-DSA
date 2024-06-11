package queue;

public class CircularQueue {
    int[] q;
    int maxsize;
    int front;
    int rear;
    int count;

    void createQueue(int size) {
        maxsize = size;
        front = 0;
        rear = -1;
        count = 0;
        q = new int[maxsize];
    }

    void enqueue(int i) {
        rear = (rear + 1) % maxsize;
        count++;
        q[rear] = i;
    }

    boolean isFull() {
        return count == maxsize;
    }

    boolean isEmpty() {
        return count == 0;
    }

    int dequeue() {
        int temp = q[front];
        front = (front + 1) % maxsize;
        count--;
        return temp;
    }

    void printQueue() {
        int c = 0;
        int i = front;
        while (c < count) {
            System.out.println(q[i] + " ");
            i = (i + 1) % maxsize;
            c++;
        }
    }
}
