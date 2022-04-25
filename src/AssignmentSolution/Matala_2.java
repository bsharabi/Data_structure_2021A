package AssignmentSolution;

public class Matala_2 {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            list1.add(i);
        }
        for (int i = 0; i < 3; i++) {
            list1.addFirst(i);
        }
        System.out.println("------------------ Print list 1 after fill -----------------------");
        list1.print();
        System.out.println("--------------------  tail and head Data -------------------------");
        list1.getTailAndHead();
        System.out.println("---------- Size list 1 ->" + list1.getSize() + " -----------------");
        System.out.println("------------------ delete from list 1 x=2 ------------------------");
        LinkedList.delete(list1, 2);
        list1.print();
        System.out.println("---------------------  tail and head Data ------------------------");
        list1.getTailAndHead();
        System.out.println("------------ Size list 1 ->" + list1.getSize() + " ---------------");
        System.out.println("--------------- check if 10 contains in list 1 -------------------");
        boolean contains = list1.contains(10);
        System.out.println(contains);
        System.out.println("-------------- check if 2 contains in list 1 ---------------------");
        contains = list1.contains(2);
        System.out.println(contains);
        System.out.println("----------------- before remove index 0 --------------------------");
        list1.print();
        list1.remove(0);
        System.out.println("------------------ after remove index 0 --------------------------");
        list1.print();
        System.out.println("------------------  tail and head Data ---------------------------");
        list1.getTailAndHead();
        System.out.println("------------ Size list 1 ->" + list1.getSize() + " ---------------");

        System.out.println("----------------------  remove index 5 ---------------------------");
        list1.remove(5);
        list1.print();
        System.out.println("---------------------  tail and head Data ------------------------");
        list1.getTailAndHead();
        System.out.println("------------ Size list 1 ->" + list1.getSize() + " ---------------");

        System.out.println("------------------------  remove index 4 -------------------------");
        list1.remove(4);
        list1.print();
        System.out.println("--------------------  tail and head Data -------------------------");
        list1.getTailAndHead();
        System.out.println("----------- Size list 1 ->" + list1.getSize() + " ----------------");

        System.out.println("----------------------  remove index 0 ---------------------------");
        list1.remove(0);
        list1.print();
        System.out.println("---------------------  tail and head Data ------------------------");
        list1.getTailAndHead();
        System.out.println("------------ Size list 1 ->" + list1.getSize() + " ---------------");

        for (int i = 0; i < 5; i++) {
            list2.add(i * 2);
        }
        System.out.println("---------------------  build sorted list2 ------------------------");
        list2.print();
        System.out.println("------------ Size list 2 ->" + list2.getSize() + " ---------------");

        System.out.println("------------------  merge list1 and list2 ------------------------");
        LinkedList<Integer> list3 = LinkedList.mergeList(list1, list2);
        list3.print();
        System.out.println("----------- Size list 3 ->" + list3.getSize() + " ----------------");

        System.out.println("------------------  tail and head Data list 3 --------------------");

        list3.getTailAndHead();
        System.out.println("------------------  tail and head Data list 2 --------------------");

        list2.getTailAndHead();
        System.out.println("-------------------  tail and head Data list 1 -------------------");

        list1.getTailAndHead();
        System.out.println("-----------------  remove index 0 from list 1 --------------------");
        list1.remove(0);
        list1.print();
        System.out.println("------------------  tail and head Data list 1 --------------------");
        list1.getTailAndHead();
        System.out.println("------------- Size list 1 ->" + list1.getSize() + " --------------");

        System.out.println("------------------  remove index 1 from list 1 -------------------");
        list1.remove(1);
        list1.print();
        System.out.println("------------------  tail and head Data list 1 --------------------");
        list1.getTailAndHead();
        System.out.println("------------ Size list 1 ->" + list1.getSize() + " ---------------");

        System.out.println("------------------  remove index 0 from list 1 -------------------");
        list1.remove(0);
        list1.print();
        System.out.println("------------------  tail and head Data list 1 --------------------");
        list1.getTailAndHead();
        System.out.println("------------ Size list 1 ->" + list1.getSize() + " ---------------");
        list1.print();
    }
}

class LinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public static LinkedList mergeList(LinkedList list1, LinkedList list2) {
        LinkedList list3 = new LinkedList<>();
        Node tempList1 = list1.tail;
        Node tempList2 = list2.tail;

        while (tempList1 != null && tempList2 != null) {

            if ((int) tempList1.data > (int) tempList2.data) {
                list3.add(tempList1.data);
                tempList1 = tempList1.prev;
            } else {
                list3.add(tempList2.data);
                tempList2 = tempList2.prev;
            }
        }
        while (tempList1 != null) {
            list3.add(tempList1.data);
            tempList1 = tempList1.prev;
        }
        while (tempList2 != null) {
            list3.add(tempList2.data);
            tempList2 = tempList2.prev;
        }
        return list3;

    }

    public static void delete(LinkedList list, int x) {
        list.head = delete(list.head, list, x, 0);
        if (list.head != null) {
            list.size = list.tail != null ? list.tail.index + 1 : 0;
            list.head.prev = null;
        }
    }

    private static Node delete(Node head, LinkedList list, int x, int index) {
        if (head == null) {
            return null;
        }
        if (head.data.equals(x)) {
            if (head.next == null)
                list.tail = head.prev;
            head.prev = delete(head.next, list, x, index);
            return head.prev;
        } else {
            head.index = index;
            head.next = delete(head.next, list, x, index + 1);
        }
        return head;
    }

    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size)
            return;
        if (index == size - 1)
            this.tail = this.tail.prev;
        this.head = remove(index, head);
        size--;
    }

    private Node<T> remove(int index, Node<T> head) {
        if (head == null)
            return null;
        head.next = remove(index, head.next);
        if (head.index == index)
            if (head.next == null)
                return null;
            else {
                head.next.prev = head.prev;
                return head.next;
            }
        if (index <= head.index)
            head.index--;
        return head;
    }



    @Override
    public void add(T data) {
        this.head = add(data, head);
    }


    private Node<T> add(T data, Node<T> head) {
        if (head == null) {
            this.tail = new Node<T>(data, size++);
            return this.tail;
        }
        head.next = add(data, head.next);
        head.next.prev = head;
        return head;
    }

    public void getTailAndHead() {
        Object tail = this.tail != null ? (this.tail.data) : null;
        Object head = this.head != null ? (this.head.data) : null;
        System.out.printf("head is " + head);
        System.out.println(", tail is " + tail);
    }

    @Override
    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data, 0);
        if (isEmpty())
            this.head = new Node<T>(data, 0);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        newNode = newNode.next;

        while (newNode != null) {
            newNode.index++;
            newNode = newNode.next;
        }
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T data) {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == data)
                    return true;
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        if (isEmpty() || index < 0 || index > size)
            return null;
        Node<T> temp = this.head;
        while (temp != null) {
            if (temp.index == index)
                return temp.data;
            temp = temp.next;
        }
        return null;
    }

    @Override
    public T getFirst() {
        if (!isEmpty())
            return head.data;
        return null;
    }

    @Override
    public T getLast() {
        if (!isEmpty())
            return tail.data;
        return null;

    }

    @Override
    public T peek() {
        if (!isEmpty())
            return head.data;
        return null;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            Object next = temp.next != null ? (temp.next.data) : null;
            Object prev = temp.prev != null ? (temp.prev.data) : null;
            System.out.printf("data = " + temp.data + ", index = " + temp.index + " nextData = " + next + " prevData =  " + prev + " \n");
            temp = temp.next;
        }

    }
}

interface List<T> {
    void add(T data);

    void addFirst(T data);

    boolean isEmpty();

    boolean contains(T data);

    T get(int index);

    T getFirst();

    T getLast();

    T peek();
}

class Node<T> {
    T data;
    Node next;
    Node prev;
    int index;

    public Node(T data, int index) {
        this.data = data;
        this.next = null;
        this.prev = null;
        this.index = index;
    }
}



