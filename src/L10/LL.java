package L10;


class LL<T> implements Ls<T> {

    private Nd head;
    private Nd tail;
    private int size;

    public LL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T value) {
        if (this.head == null) {
            this.head = new Nd(value);
            this.tail = this.head;
        } else {
            Nd<T> new_node = new Nd(value);
            this.tail.setNext(new_node);
            this.tail = new_node;
        }
        size++;
    }
    @Override
    public T get(int index) {
        if (isEmpty() || index < 0 || index > size)
            return null;
        Nd<T> temp = this.head;
        int count=0;
        while (temp != null) {
            if (count == index)
                return temp.getValue();
            temp = temp.getNext();
            count++;
        }
        return null;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
