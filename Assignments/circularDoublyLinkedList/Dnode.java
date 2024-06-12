package LinkedList.circular_doubly_linked_list;

public class Dnode {
    int data;

    Dnode left;
    Dnode right;

    Dnode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
