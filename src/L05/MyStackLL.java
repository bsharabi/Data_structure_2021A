package L05;

import java.util.LinkedList;

public class MyStackLL implements IStackAction {

    public  boolean contains(MyStackLL st, int q) {
        MyStackLL temp = new MyStackLL();
        boolean answer = false;
        while (!st.empty()) {
            int a = st.pop();
            if (a == q) answer = true;
            temp.push(a);
        }
        while (!temp.empty()) {
            int a = st.pop();
            st.push(a);
        }
        return answer;
    }

    //Memory O(size)
    private LinkedList<Integer> ll = new LinkedList<Integer>();

    //O(1)
    public void push(int i) {
        ll.addFirst(i);
    }

    //O(1)
    public int pop() {
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

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public int search() {
        return 0;
    }

}
