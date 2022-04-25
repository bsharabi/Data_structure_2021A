package L10;


public class Nd<T> {

    private T value;
    private Nd<T> next;

    public Nd(T value) {
        this.value = value;
        this.next = null;
    }

    public Nd(T value, Nd<T> next) {
        this.value = value;
        this.next = next;
    }

    public Nd<T> getNext() {
        return this.next;
    }

    public void setNext(Nd<T> next) {
        this.next = next;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean hasNext() {
        return this.next != null;
    }

//    public String toString(){
//        return " "+this.value;
//    }
}

