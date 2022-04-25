package L10;

import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(6);
        st.add(12);
        st.add(2);
        st.add(10);
        st.add(7);
        st.add(5);
        System.out.println(st);
        f(st);
        System.out.println(st);

    }

    public static void f(Stack<Integer> st) {
        if (st.isEmpty()) //O(1)
            return;

        //O(n)
        Stack<Integer> sTemp = (Stack) st.clone();

        //O(n)
        int avg = 0;
        while (!sTemp.isEmpty()) {
            avg += sTemp.pop();
        }
        //O(1)
        avg /= st.size();

        //o(1)
        Stack<Integer> bigger = new Stack<>();
        Stack<Integer> smaller = new Stack<>();
        //O(n)
        while (!st.isEmpty()) {
            if (st.peek() <= avg)
                smaller.push(st.pop());
            else
                bigger.push(st.pop());
        }
        //O(n)
        while (!smaller.isEmpty())
            st.push(smaller.pop());
        //o(n)
        while (!bigger.isEmpty())
            st.push(bigger.pop());

        //sum complexity O(n)
    }
}
