package AssignmentSolution;

import java.util.Arrays;
import java.util.Stack;

public class Test2022_A {


    public static void main(String[] args) {
        //------------------------ Question 1 ----------------------------------
        int n = 10;
        //O(n^2) -> (n-1)+(n-2)+(n-3)+...+2+1 = n*(n-1)/2 סכום סדרה חשבונית
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("Hello");
            }
            System.out.println(" World");
        }
        long time = System.currentTimeMillis();
        time += 30;
        //O)(inf) -> בכל סיבוב אנחנו מבצעים הורדה של 1 מהזקיף ולכן תמיד מתקיים ש i<n לכל n חיובי
        int i = 0;
        while (i < n) {
            System.out.print("Hello");
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" World ");
            }
            --i;
            if (time > System.currentTimeMillis())
                break;
        }
        //O(n^2) -> (n-1)*10+(n-2)*10+(n-3)*10+...+2*10+1*10 =10*((n-1)+(n-2)+(n-3)+...+2+1)=10*(n*(n-1)/2) סכום סדרה חשבונית
        i = 0;
        while (i < n) {
            System.out.print("Hello");
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" World");
                for (int k = 0; k < 10; k++) {
                    System.out.print("!!");
                }
            }
            i++;
        }
        //O(inf) בכל איטרציה מכפילים את הזקיף ב-2 אבל הזקיף מאותחל ב-0 ולכן תמיד ישאר 0
        i = 0;
        time = System.currentTimeMillis();
        time += 30;
        while (i < n) {
            System.out.print("Hello");
            for (int j = 0; j < n - i - 1; j++) {
                System.out.println(" World");
            }
            i *= 2;
            if (time > System.currentTimeMillis())
                break;
        }
        //public boolean empty()(LinkedList)-> O(1)
        //public boolean pop()(Stack)-> O(1)
        //public boolean add()(Queue)-> O(1)
        //--------------------- Question 2 -----------------------------
        Stack<String> st = new Stack<>();
        st.push("3");
        st.push("$");
        st.push("A");
        st.push("@");
        st.push("&");
        System.out.println("Before - >" + st);
        String ans = deepStack(st, 4);
        System.out.println("ans -> " + ans);
        System.out.println("After - >" + st);
        //------------------------ Question 3 -----------------------------
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(3);
        s1.push(5);
        s1.push(6);
        s1.push(8);

        s2.push(8);
        s2.push(3);
        s2.push(7);
        s2.push(1);

        System.out.println(s1);
        System.out.println(s2);
        mystery(s1, s2);
        System.out.println(s1);
        System.out.println(s2);
        //------------------------ Question 4 -----------------------------
        Node head = new Node(-1);
        Node temp = head;
        for (i = 0; i < 10; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }
//        temp.next = new Node(-4);
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
        int index = getLast(head);
        System.out.println("index -> " + index);
        int isSort = isSorted(head);
        System.out.println("is sorted -> " + isSort);

        //------------------------ Question 5 -----------------------------
        int a[] = {1, 6, 2, -1, 6, 85, 2, -200};
        System.out.println(Arrays.toString(a));
        recursive_bubble_sort(a, a.length);
        System.out.println(Arrays.toString(a));

    }

    public static void mystery(Stack<Integer> s1, Stack<Integer> s2) {

        int z = 0;
        Stack<Integer> s3, s4;
        s3 = new Stack<>();
        s4 = new Stack<>();
        while (!s1.isEmpty()) {
            s3.push(s1.pop());
        }
        while (!s2.isEmpty()) {
            s4.push(s2.pop());
        }
        while (!s3.isEmpty() && !s4.isEmpty()) {
            z += s3.pop() + s4.pop();
            s1.push(z % 10);
            z /= 10;
        }
        if (z != 0) {
            s1.push(z);
        }

    }

    public static String deepStack(Stack<String> st, int k) {
        String deep = "";

        if (st.isEmpty() || k > st.size())
            return deep;
        Stack<String> temp = new Stack<>();
        for (int i = 0; i < k; i++) {
            deep = st.pop();
            temp.push(deep);
        }
        for (int i = 0; i < k; i++) {
            st.push(temp.pop());
        }
        return deep;

    }

    public static int getLast(Node head) {
        int index = -1;
        if (head == null)
            return index;
        while (head != null) {
            head = head.next;
            index++;
        }
        return index;
    }

    public static int isSorted(Node head) {
        if (head == null)
            return 1;
        while (head.next != null) {
            if (head.data > head.next.data)
                return 0;
            head = head.next;
        }
        return 1;
    }

    private static void swap(int a[], int i) {
        if (a[i] < a[i - 1]) {
            int temp = a[i];
            a[i] = a[i - 1];
            a[i - 1] = temp;
        }
    }

    public static void recursive_bubble_sort(int a[], int n) {
        if (n == 0)
            return;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                swap(a, i);
            }
        }
        recursive_bubble_sort(a, n - 1);
    }

    //create subclass
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
