package L10;

public class Q1 {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";


    public static void main(String[] args) {
        Nd<Integer> chain = new Nd(1);
        Nd<Integer> temp = chain;
        for (int i = 2; i <= 4; i++) {
            temp.setNext(new Nd(i));
            temp = temp.getNext();
        }
        temp = chain;
        while (temp != null) {
//            System.out.print(ANSI_RED + " (" + temp + ") ");
            System.out.print(ANSI_GREEN + temp.getValue() + " --> ");
            temp = temp.getNext();
        }
        System.out.println(ANSI_CYAN + "null");


        second(chain);
        temp = chain;

        while (temp != null) {
//            System.out.print(ANSI_RED+" (" + temp + ") ");
            System.out.print(ANSI_BLUE + temp.getValue() + " --> ");
            temp = temp.getNext();

        }
        System.out.println(ANSI_CYAN + "null");

    }

    public static void first(Nd<Integer> chain) {
        if (chain == null)
            return;

        while (chain != null) {
//            Nd<Integer> temp = new Nd(chain.getValue());
            Nd<Integer> temp = new Nd(chain.getValue(), chain.getNext());
//            temp.setNext(chain.getNext());
            chain.setNext(temp);
            chain = temp.getNext();
        }
    }

    public static void second(Nd<Integer> chain) {
        if (chain == null)
            return;
        Nd<Integer> tempHead = new Nd(chain.getValue());
        Nd<Integer> temp = tempHead;

        while (chain.getNext() != null) {
            temp.setNext(new Nd(chain.getNext().getValue()));
            temp = temp.getNext();
            chain = chain.getNext();
        }
        chain.setNext(tempHead);
    }
}
