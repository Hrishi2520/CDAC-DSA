package LinkedList.doubly_linked_list;

public class Doubly_Linked_List {
    Dnode root;

    void create_list() {
        root = null;//root is not there
    }

    void insert_left(int e) {
        Dnode n = new Dnode(e);
        if (root == null)//not there then n is root
            root = n;
        else {
            n.right = root;//1
            root.left = n;//2
            root = n;//3
        }
        System.out.println(e + " inserted");

    }

    void insert_right(int e) {
        Dnode n = new Dnode(e);//created
        if (root == null)//not there then n is root
            root = n;
        else {
            Dnode t = root;//1
            while (t.right != null)//2
                t = t.right;
            t.right = n;//3
            n.left = t;//4
        }
        System.out.println(e + " inserted");
    }

    void delete_left() {
        if (root == null)//not there then n is root
            System.out.println("Empty list");
        else {
            Dnode t = root;//1
            if (root.left == null && root.right == null)
                root = null;
            else {
                root = root.right;//2
                root.left = null;//3
            }
            System.out.println(t.data + " deleted");

        }
    }

    void delete_right() {
        if (root == null)//not there then n is root
            System.out.println("Empty list");
        else {
            Dnode t = root;//1
            while (t.right != null)//2
                t = t.right;
            if (root.left == null && root.right == null)
                root = null;
            else {
                Dnode t2 = t.left;
                t2.right = null;//3
            }
            System.out.println(t.data + " deleted");

        }
    }

    void print_list() {
        if (root == null)
            System.out.println("Empty list");
        else {
            Dnode t = root;//1
            while (t != null) {
                System.out.print("<-|" + t.data + "|->");
                t = t.right;
            }
        }
    }
}
