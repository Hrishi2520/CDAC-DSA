package LinkedList.circular_Linked_List;

public class CircularLinkedList {
    Node root, last;

    void create_list() {
        root = last = null;//root is not there
    }

    void insert_left(int e) {
        Node n = new Node(e);
        if (root == null)//not there then n is root
        {
            root = last = n;
            last.next = root;
        } else {
            n.next = root;//1
            root = n;//2
            last.next = root;//3
        }
        System.out.println(e + " inserted");

    }

    void insert_right(int e) {
        Node n = new Node(e);//created
        if (root == null)//not there then n is root
        {
            root = last = n;
            last.next = root;
        } else {
            last.next = n;
            last = n;
            last.next = root;

        }
        System.out.println(e + " inserted");
    }

    void delete_left() {
        if (root == null)//not there then n is root
            System.out.println("Empty list");
        else {
            Node t = root;//1
            if (root == last)//single node
                root = last = null;
            else {
                root = root.next;//2
                last.next = root;//3
            }
            System.out.println(t.data + " deleted");
        }
    }

    void delete_right() {
        if (root == null)//not there then n is root
            System.out.println("Empty list");
        else {
            Node t = root;//1
            Node t2 = t;//1
            while (t.next != root)//2
            {
                t2 = t;
                t = t.next;
            }
            if (t == root)//one node only
            {
                root = last = null;
            } else {
                last = t2;//
                last.next = root;//3
            }
            System.out.println(t.data + " deleted");
        }
    }

    void print_list() {
        if (root == null)
            System.out.println("Empty list");
        else {
            Node t = root;//1
            do {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            } while (t != root);
        }
    }
}