package LinkedList.dynamic_queue;

public class DynamicQueue {

    Node front, rear;

    void create_queue() {
        rear = front = null;//root is not there
    }

    void enqueue(int e) {
        Node n = new Node(e);//created
        if (rear == null)//not there then n is root
        {
            rear = front = n;
        } else {
            rear.next = n;
            rear = n;
            System.out.println(e + " Enqueued");
        }
    }

    void dequeue() {
        if (front == null)//
            System.out.println("Empty Queue");
        else {
            Node t = front;//1
            //single node case
            if (front == rear)
                front = rear = null;
            else
                front = front.next;//2
            System.out.println(t.data + " dequeued");
        }
    }

    void print_queue() {
        if (front == null)
            System.out.println("Empty queue");
        else {
            Node t = front;//1
            while (t != null) {
                System.out.print("|" + t.data + "|-");
                t = t.next;
            }
        }
    }
}
