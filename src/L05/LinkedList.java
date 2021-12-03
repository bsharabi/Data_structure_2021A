package L05;

public class LinkedList implements List {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(int data) {
        if (this.head == null) {
            this.head = new Node(data, size);
            this.tail = this.head;
        } else {
            Node new_node = new Node(data, size);
            this.tail.next = new_node;
            this.tail = new_node;
        }
        size++;
    }

    @Override
    public void addFirst(int data) {
        if (this.head == null) {
            this.head = new Node(data, 0);
            this.tail = this.head;
        } else {
            Node new_node = new Node(data, 0);
            Node temp_node = this.head;
            this.head.prev = new_node;
            new_node.next = this.head;
            this.head = new_node;
            while (temp_node != null) {
                temp_node.index++;
                temp_node = temp_node.next;
            }
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(int data) {
        if (isEmpty())
            return false;
        Node temp_head = this.head;
        while (temp_head != null && temp_head.data != data)
            temp_head = temp_head.next;
        return temp_head != null;
    }

    public void removeFirst() {
        if (isEmpty())
            return;
        Node temp_head = this.head.next;
        this.head = temp_head;
        temp_head.prev = null;
        while (temp_head != null) {
            temp_head.index--;
            temp_head = temp_head.next;
        }
        size--;

    }

    public int get(int index) {
        if (isEmpty() || index < 0 || index >= this.size)
            return Integer.MAX_VALUE;
        Node temp_head = this.head;
        while (temp_head != null && temp_head.index != index)
            temp_head = temp_head.next;

        assert temp_head != null;
        return temp_head.data;
    }

    @Override
    public int getFirst() {

        return this.head != null ? this.head.data : Integer.MAX_VALUE;
    }

    @Override
    public int getLast() {
        return this.head != null ? this.tail.data : Integer.MAX_VALUE;
    }

    @Override
    public int peek() {
        return this.head != null ? this.head.data : Integer.MAX_VALUE;
    }

    @Override
    public int remove(int index) {
        try {
            if (isEmpty() || index < 0 || index >= this.size)
                throw new Exception("The list is empty or the index does not exist");
            int data;

            if (index == 0) {
                data = this.head.data;
                Node next_head = this.head.next;
                this.head = next_head;
                size--;
                if (next_head == null)
                    throw new Exception("The list is now empty");
                next_head.prev = null;
                while (next_head != null)
                    next_head = next_head.next;
                return data;
            }
            if (index == size - 1) {
                data = this.tail.data;
                Node prev_tail = this.tail.prev;
                this.tail = prev_tail;
                size--;
                if (prev_tail == null) {
                    throw new Exception("The list is now empty");
                }
                prev_tail.next = null;
                return data;
            }
            Node temp_head = this.head;
            while (temp_head != null && temp_head.index != index) {
                temp_head = temp_head.next;
            }
            data = temp_head.data;
            Node next_node = temp_head.next;
            Node prev_node = temp_head.prev;
            prev_node.next = next_node;
            next_node.prev = prev_node;
            return data;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    @Override
    public String toString() {
        Node temp_head = this.head;
        while (temp_head != null) {
            System.out.printf("Index = %d ", temp_head.index);
            System.out.printf("prev = %s ", temp_head.prev != null ? temp_head.prev.data : "null");
            System.out.printf(",data =%s ", temp_head.data);
            System.out.printf(",next = %s ", temp_head.next != null ? temp_head.next.data : "null");
            temp_head = temp_head.next;
            System.out.println("");
        }
        return "LinkedList{size =" + size + "}";
    }
}

