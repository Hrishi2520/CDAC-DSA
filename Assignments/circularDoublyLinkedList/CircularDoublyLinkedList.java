package LinkedList.circular_doubly_linked_list;

public class CircularDoublyLinkedList {
    Dnode root, last;

    void create_list() {
        root = last = null;
    }

    void insert_left(int e) {
        Dnode n = new Dnode(e);
        if (root == null)
            root = last = n;
        else {
            n.right = root;
            root.left = n;
            root = n;
            last.right = root;
            root.left = last;
        }
        System.out.println(e + " inserted");

    }

    void insert_right(int e) {
        Dnode n = new Dnode(e);//created
        if (root == null)
            root = last = n;
        else {
            last.right = n;
            n.left = last;
            last = n;
            last.right = root;
            root.left = last;
        }
        System.out.println(e + " inserted");
    }

    void print_list() {
        if (root == null)
            System.out.println("Empty list");
        else {
            Dnode t = root;//1
            do {
                System.out.print("<-|" + t.data + "|->");
                t = t.right;
            }
            while (t != root);
        }
    }
}
