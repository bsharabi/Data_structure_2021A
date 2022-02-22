package AssignmentSolution;

import java.util.Arrays;
import java.util.Stack;

public class Test2022_B {


    public static void main(String[] args) {

//        //------------------------ Question 1A ----------------------------------
//        int n = 10;
//        //O(n^2) -> 2n+2n+2n+...+2n = 2n*(n)= 2n^2
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 2*n; j++) {
//                System.out.print("Hello");
//            }
//            System.out.println(" World");
//        }
//
//
//        //(n)+(n-2)+(n-4)+(n-6)+...+(2)=(0.5n(n+2))/0.5 =(n^2)/4+(n/2) =O(n^2)
//        //\...........0.5n............./
//        int i = 0;
//        while (i < n) {
//            System.out.print("Hello");
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" World ");
//            }
//            i+=2;
//        }
//        //O(n^2) -> (n-1)*10+(n-2)*10+(n-3)*10+...+2*10+1*10 =10*((n-1)+(n-2)+(n-3)+...+2+1)=10*(n*(n-1)/2) סכום סדרה חשבונית
//        i = 0;
//        while (i < n) {
//            System.out.print("Hello");
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" World");
//                for (int k = 0; k < 10; k++) {
//                    System.out.print("!!");
//                }
//            }
//            i++;
//        }
//        //O(inf) בכל איטרציה מכפילים את הזקיף ב-2 אבל הזקיף מאותחל ב-0 ולכן תמיד ישאר 0
//        i = 0;
//        while (i < n) {
//            System.out.print("Hello");
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.println(" World");
//            }
//            i *= 2;
//        }
//------------------------ Question 1B ----------------------------------
        //addLast(int data)  (LinkedList) = O(1)
        //push(int data)     (Stack)      = O(1)
        //poll()             (Queue)      = O(1)

//------------------------ Question 2a ----------------------------------
        System.out.println("-----------------Question 2a-------------------");
        System.out.println("The number is " + mystery(2047));
        System.out.println("-----------------------------------------------");
//------------------------ Question 2b ----------------------------------
// הפונקציה לעיל מקבלת מספר שלם ומבצעת היפוך למספר

// ------------------------ Question 3 ----------------------------------
        Stack<Integer> st = new Stack<>();
        st.push(5);//index 4
        st.push(6);//index 3
        st.push(5);//index 2
        st.push(4);//index 1
        System.out.println("-----------------Question 3-------------------");
        System.out.println("Before " + st);
        System.out.println("is Equal " + q3(st));
        System.out.println("After " + st);
        System.out.println("-----------------------------------------------");
// ------------------------ Question 4 ----------------------------------
        node list1 = new node(5);
        list1.next = new node(1);
        list1.next.next = new node(4);
        list1.next.next.next = new node(6);
        list1.next.next.next.next = new node(9);
        //list1 = 5->1->4->6->9->null

        node pos = list1.next.next;

        node list2 = new node(7);
        list2.next = new node(9);
        //list2 = 7->9->null
        System.out.println("-----------------Question 4-------------------");
        System.out.println("List1");
        printList(list1);
        System.out.println("List2");
        printList(list2);
        list_insert_list(list1, pos, list2);
        System.out.println("List1");
        printList(list1);
        System.out.println("List2");
        printList(list2);
        System.out.println("-----------------------------------------------");
// ------------------------ Question 5 ----------------------------------
        System.out.println("-----------------Question 5--------------------");
        System.out.println("Before " + st);
        System.out.println("deep Stack " + recursive_search(st, 3));
        System.out.println("After " + st);
        System.out.println("-----------------------------------------------");
    }

    public static void list_insert_list(node list1, node pos, node list2) {
        if (list1 == null || list2 == null || pos == null)
            return;
        node tempNext = pos.next;
        pos.next = list2;
        while (pos.next != null)
            pos = pos.next;
        pos.next = tempNext;
    }

    private static void printList(node head) {
        if (head == null)
            return;
        while (head != null) {
            System.out.printf(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static int mystery(int num) {
        int x = 0, y = 1;
        Stack<Integer> s = new Stack();
        while (num != 0) {
            s.push(num % 10);
            num /= 10;
        }
        while (!s.isEmpty()) {
            x += y * s.pop();
            y *= 10;
        }
        return x;
    }

    public static boolean q3(Stack<Integer> st) {

        if (st == null || st.isEmpty())
            return true;
        Stack<Integer> sTemp = (Stack<Integer>) st.clone();
        int index = 1;
        int Odd_index = 0;
        int Odd_number = 0;

        while (!sTemp.isEmpty()) {
            if (index % 2 != 0)
                Odd_index += sTemp.peek();
            if (sTemp.peek() % 2 != 0)
                Odd_number += sTemp.peek();
            sTemp.pop();
            index++;
        }
        return Odd_index == Odd_number;
    }

    public static int recursive_search(Stack<Integer> st, int index) {
        if (index == 0)
            return st.peek();
        int temp = st.pop();
        int res = recursive_search(st, --index);
        st.push(temp);
        return res;
    }

    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

