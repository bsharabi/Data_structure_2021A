package L05;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.isEmpty());
        System.out.println(list.get(0));
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            list.addFirst(i);
        }

        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.remove(8);
        System.out.println(list);
    }
}
