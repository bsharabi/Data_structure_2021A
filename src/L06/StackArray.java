package L06;

public class StackArray {

    //[3,54,6,8,9,6,0,0,0,0]
    private int[] stack;
    private int size;
    private int capacity;

    //Memory O(capacity)
    public StackArray(int capacity) {
        if (capacity <= 0)
            capacity = 10;
        this.stack = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    //O(size)
    public void init() {
        capacity *= 2;
        int temp[] = new int[capacity];
        for (int i = 0; i < stack.length; i++)
            temp[i] = stack[i];
        this.stack = temp;
    }
    //O(size) || O(1)
    public void push(int data) {
        if (size == capacity)
            init();
        this.stack[size++] = data;
    }
    //O(1)
    public int pop() {
        if (isEmpty())
            return Integer.MAX_VALUE;
        return stack[--size];
    }
    //O(1)
    public boolean isEmpty() {
        return size == 0;
    }
    //O(1)
    public int get(int index) {
        if (index < 0 || isEmpty() || index >= size)
            return Integer.MAX_VALUE;
        return stack[index];
    }

}
