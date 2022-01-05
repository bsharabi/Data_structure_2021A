package L09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Question {


    public static void main(String[] args) {
        //--------------------- Question 1 --------------------------
        System.out.println("--------------------- Question 1 --------------------------");
        Queue<String> q1 = new LinkedList<>();
        String[] names = {"Aviel", "Shay G", "Shay Z", "Daniel", "Shir", "Barak"};
        for (int i = 0; i < names.length; i++) {
            q1.add(names[i]);
        }
        System.out.println(q1);
        System.out.println(leader(q1));
        System.out.println(q1);

        //--------------------- Question 2 --------------------------
        System.out.println("--------------------- Question 2 --------------------------");
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            q2.add(i);
        }
        System.out.println(q2);
        System.out.println(Size(q2));
        System.out.println(q2);

        System.out.println(q2);
        System.out.println(sizeQ(q2));
        System.out.println(q2);

        //--------------------- Question 3 --------------------------
        System.out.println("--------------------- Question 3 (a) --------------------------");
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 8; i++) {
            st.push(i);
        }
        System.out.println(st);
        System.out.println(Size(st));
        System.out.println(st);

        System.out.println("--------------------- Question 3 (b) --------------------------");
        System.out.println(st);
        System.out.println(stackSize(st));
        System.out.println(st);

        System.out.println("--------------------- Question 3 (b) without clone --------------------------");
        System.out.println(st);
        System.out.println(size(st));
        System.out.println(st);

        System.out.println("--------------------- Question 4  --------------------------");
        Stack<String> stStr = new Stack<>();
        for (int i = 0; i < names.length; i++) {
            stStr.push(names[i]);
        }
        System.out.println(stStr);
        System.out.println(GetStringLength(stStr));
        System.out.println(stStr);

        System.out.println("--------------------- Question 5  --------------------------");
        Stack<Integer>[] stacks = new Stack[5];
        Random rd = new Random();
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();
        }
        for (int i = 0; i < stacks.length; i++) {

            if (rd.nextInt(3) != 0) {
                for (int j = 0; j < rd.nextInt(45); j++) {
                    stacks[i].push(rd.nextInt(87));
                }
            }
        }
        for (int i = 0; i < stacks.length; i++) {
            if (!stacks[i].isEmpty())
                System.out.println(stacks[i]);
            else
                System.out.println("[]");
        }
        System.out.println(GetTopSum(stacks));
        for (int i = 0; i < stacks.length; i++) {
            if (!stacks[i].isEmpty())
                System.out.println(stacks[i]);
            else
                System.out.println("[]");
        }

        System.out.println("--------------------- Question 6  --------------------------");
        String[] s = {"%", "$", "#", "@", "&"};
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            stack.push(s[i]);
        }
        System.out.println(stack);
        System.out.println(RemoveItemAt(4, stack));
        System.out.println(stack);
    }

    //O(n*k)
    public static String leader(Queue<String> q) {
        if (q.isEmpty())
            return "";
        Queue<String> temp_q = new LinkedList<>(q);
        String name = " ";
        Random rd = new Random();
        int k = rd.nextInt(9) + 2;
        int count = 1;
        System.out.println(k);
        while (!temp_q.isEmpty()) {
            if (k != count && temp_q.size() != 1) {
                temp_q.add(temp_q.poll());
                count++;
                System.out.println(temp_q);
            } else {
                name = temp_q.poll();
                count = 1;
            }
        }
        return name;
    }

    //O(n)
    public static int Size(Queue<Integer> q) {
        if (q.isEmpty())
            return 0;
        Queue<Integer> temp_q = new LinkedList<>();
        int count = 0;
        while (!q.isEmpty()) {
            temp_q.add(q.poll());
            count++;
        }
        while (!temp_q.isEmpty()) {
            q.add(temp_q.poll());
        }
        return count;
    }

    //O(n)
    public static int sizeQ(Queue<Integer> q) {
        if (q.isEmpty()) return 0;
        Queue<Integer> temp = new LinkedList<>(q);
        temp.poll();
        return sizeQ(temp) + 1;
    }

    //O(n)
    public static int Size(Stack<Integer> s) {
        if (s.isEmpty())
            return 0;
        int temp = s.pop();
        int size = Size(s) + 1;
        s.push(temp);
        return size;
    }

    public static int stackSize(Stack<Integer> s) {
        if (s.isEmpty())
            return 0;
        Stack temp_s = (Stack) s.clone();

        int counter = 0;
        while (!temp_s.isEmpty()) {
            temp_s.pop();
            counter++;
        }
        return counter;
    }

    public static int size(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        int size = 0;
        while (!s.isEmpty()) {
            temp.push(s.pop());
            size++;
        }
        while (!temp.isEmpty())
            s.push(temp.pop());

        return size;
    }

    public static Stack<Integer> GetStringLength(Stack<String> s) {
        Stack<String> temp = new Stack<>();
        Stack<Integer> stringLength = new Stack<>();
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }
        while (!temp.isEmpty()) {
            stringLength.push(temp.peek().length());
            s.push(temp.pop());
        }

        return stringLength;
    }

    public static int GetTopSum(Stack<Integer>[] stacks) {
        int size = stacks.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (!stacks[i].isEmpty())
                sum += stacks[i].peek();
        }
        return sum;
    }

    public static String RemoveItemAt(int k, Stack<String> st) {
        if (k > st.size() || k < 0)
            return "";
        int cnt = k;
        String str = "";
        Stack<String> tempST = new Stack<>();
        while (!st.isEmpty()) {
            tempST.push(st.pop());
            if (cnt == 1)
                str = tempST.pop();
            cnt--;
        }
        while (!tempST.isEmpty())
            st.push(tempST.pop());
        return str;
    }

}
