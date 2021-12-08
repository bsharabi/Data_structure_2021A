package L06;

import java.util.LinkedList;
import java.util.List;

public class StackLL {

    private LinkedList<Integer> stack;

    //Memory O(n)
    public StackLL() {
        this.stack = new LinkedList<>();
    }

    //O(1)
    public void push(int data) {
        stack.addFirst(data);
    }

    //O(1)
    public int pop() {
        if (isEmpty())
            return Integer.MAX_VALUE;
        return  stack.removeFirst();
    }

    //O(1)
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    //O(n)
    public int get(int index) {
        if (index < 0 || isEmpty() || index >= stack.size())
            return Integer.MAX_VALUE;
        return stack.get(index);
    }


}
