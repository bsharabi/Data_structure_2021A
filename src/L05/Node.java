package L05;

public class Node {
    int data;
    Node next;
    Node prev;
    int index;

    public Node(int data, int index) {
        this.data = data;
        this.next = null;
        this.prev=null;
        this.index = index;
    }
}
