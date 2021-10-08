package L07;

public class MyQueueArray {

    public static void main(String[] args) {

    }
    //Memory O(capacity)
    private int[] a;
    private int size = 0;
    private int p = 0;

    public MyQueueArray(int capacity) {
        this.a = new int[capacity];
    }

    //O(1)
    public void push(int i) {
        if (size < a.length) {
            this.a[p] = i;
            p = (p + 1) % a.length;
            size++;
        }
    }

    //O(1)
    public int pop() {
        if (size == 0)
            return Integer.MIN_VALUE;
        else {
            int b = (p - size + a.length) % a.length;
            size--;
            return a[b];
        }

    }

    public boolean empty() {
        return (size > 0) ? false : true;
    }

    //O(size)
    public boolean contains(int q) {
        for (int i = 0; i < size; i++)
            if (a[i] == q)
                return true;
        return false;
    }

    public int getSize() {
        return size - 1;
    }
}
