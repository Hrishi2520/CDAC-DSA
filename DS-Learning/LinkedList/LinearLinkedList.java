package LinkedList;

public class LinearLinkedList {
    Node root;

    void createList() {
        root = null;
    }

    void insert_left(int e) {
        Node n = new Node(e);
        if (root == null) {
            root = n;
        } else {
            n.next = root;
            root = n;
        }
        System.out.println(e + " inserted");
    }

    void delete_left() {
        if (root == null) {
            System.out.println("Empty list");
        } else {
            Node t = root;
            root = root.next;
            System.out.println(t.data + " deleted");
        }
    }

    void insertRight(int e) {
        Node n = new Node(e);
        if (root == null) {
            root = n;
        } else {
            Node t = root;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;
        }
        System.out.println(e + " inserted");
    }

    void delete_right() {
        if (root == null)//not there then n is root
            System.out.println("Empty list");
        else {
            Node t = root;//1
            Node t2 = t;//1
            while (t.next != null)//2
            {
                t2 = t;
                t = t.next;
            }
            if (t == root)//one node only
                root = null;
            else
                t2.next = null;//3

            System.out.println(t.data + " deleted");
        }
    }

    void print_list() {
        if (root == null)
            System.out.println("Empty list");
        else {
            Node t = root;//1
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
        }
    }

    void search_list(int key) {
        if (root == null)
            System.out.println("Empty list");
        else {
            Node t = root;//1
            while (t != null) {
                if (t.data == key)
                    break;
                t = t.next;
            }
            if (t == null)
                System.out.println(key + " Not Found");
            else
                System.out.println(key + " Found");
        }
    }
}
