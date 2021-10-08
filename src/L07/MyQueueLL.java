package L07;
import java.util.LinkedList;
public class MyQueueLL {

    public static void main(String[] args) {

    }

    //Memory(size)
    private LinkedList<Integer> ll = new LinkedList();


    //O(1)
    public void Enqueue(int i) {
        ll.addLast(i);
    }

    //O(1)
    public int Dequeue() {
        return ll.removeFirst();
    }

    //O(1)
    public boolean empty() {
        return ll.isEmpty();
    }

    //O(size)
    public boolean contains(int q) {
        return ll.contains(q);
    }

    //O(1)
    public int getSize() {
        return ll.size();
    }

}
