package L05;

public class MyStackArray implements IStackAction {

    //Memory O(capacity)
    private int[] a;
    private int size = 0;

    public MyStackArray(int capacity) {
        this.a = new int[capacity];
    }

    //O(1)
    public void push(int i) {
        if (size < a.length)
            this.a[size++] = i;
    }

    //O(1)
    public int pop() {
        if (size > 0)
            return this.a[--size];
        return Integer.MIN_VALUE;
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
        return size;
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public int search() {
        return 0;
    }
}
