package L10;

public class Mn {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        LL<LL<Integer>> l = new LL();
        LL<Integer> l1 = new LL();
        l.add(new LL<Integer>());
        l.add(new LL<Integer>());
        for (int i = 0; i < 20; i++) {
            if(i%2==0)
                l.get(0).add(i);
            else
                l.get(1).add(i);
        }
        int countEven=0;
        int countOdd=0;
        for (int i = 0; i <20 ; i++) {
            if(i%2==0)
                System.out.println(ANSI_RED +"Link-0 "+l.get(0).get(countEven++)+ANSI_RESET);
            else
                System.out.println(ANSI_YELLOW+"Link-1 "+l.get(1).get(countOdd++)+ANSI_RESET);
        }
    }
}
