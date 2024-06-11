package queue;

public class PriorityQueue {
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

    void enqueue(int e) {
        q[++rear] = e;
        for (int i = front; i < rear; i++) {
            for (int j = front; j < rear; j++) {
                if (q[j] > q[j + 1]) {
                    int temp = q[j];
                    q[j] = q[j + 1];
                    q[j + 1] = temp;
                }
            }
        }
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
