package LinkedList.doubly_linked_list;

public class Dnode {
    int data;

    Dnode left, right;

    Dnode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
