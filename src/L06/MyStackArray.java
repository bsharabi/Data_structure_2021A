package L06;

public class MyStackArray {

    public static void main(String[] args) {

    }

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
        return size - 1;
    }
}
