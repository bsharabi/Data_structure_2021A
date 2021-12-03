package L05;

interface List {
    /**
     * Appends the specified element to the end of this list.
     */
    void add(int data);

    /**
     * Inserts the specified element at the beginning of this list.
     */
    void addFirst(int data);

    boolean isEmpty();

    boolean contains(int data);

    int get(int index);

    int getFirst();

    int getLast();

    int peek();

    int remove(int index);
}
