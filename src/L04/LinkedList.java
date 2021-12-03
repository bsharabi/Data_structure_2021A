package L04;


public class LinkedList{

    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedList() {
        this.head = null;
        this.tail=null;
        this.size = 0;
    }

    public void add(int d) {
        if (this.head == null) {
            this.head = new Node(d, size++);
            this.tail=this.head;
        }
        else {
            Node new_node = new Node(d, size++);
            Node temp_head = this.head;
            while (temp_head.next != null)
                temp_head = temp_head.next;
            temp_head.next = new_node;
        }
    }
    public boolean isEmpty() {
        return size==0;
    }
    public void removeFirst(){

    }
    public void remove(int index){

    }

    public int get(int index) {
        if(isEmpty() ||index<0 ||index>= this.size)
            return Integer.MAX_VALUE;
        Node temp_head = this.head;
        while (temp_head!= null&& temp_head.index!=index)
            temp_head = temp_head.next;

        return temp_head.data;
    }
    @Override
    public String toString() {
        if (this.head == null)
            return "null";
        else {
            Node temp_head = this.head;
            while (temp_head != null) {
                System.out.printf("%d ", temp_head.data);
                temp_head = temp_head.next;
            }
            System.out.println("");
        }
        return "LinkedList{size ="+size +"}";
    }
}

