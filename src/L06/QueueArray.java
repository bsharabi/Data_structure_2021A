package L06;

public class QueueArray {

    private int[] qu;
    private int size;
    private int p;

    public QueueArray(int capacity) {
        this.qu = new int[capacity];
        this.p=0;
        this.size=0;
    }
    //O(1)
    public void push(int i) {
        if (size < qu.length) {
            this.qu[p] = i;
            p = (p + 1) % qu.length;
            size++;
        }
    }

    //O(1)
    public int pop() {
        if (size == 0)
            return Integer.MIN_VALUE;
        else {
            int b = (p - size + qu.length) % qu.length;
            size--;
            return qu[b];
        }

    }
    //O(1)
    public boolean empty() {
        return (size > 0) ? false : true;
    }

    //O(n)
    public boolean contains(int q) {
        for (int i = 0; i < size; i++)
            if (qu[i] == q)
                return true;
        return false;
    }
    //O(1)
    public int getSize() {
        return size;
    }
}
