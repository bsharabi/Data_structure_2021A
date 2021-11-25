package L04;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rd = new Random();
        java.util.LinkedList<Integer> k =new java.util.LinkedList<>();
        k.remove(5);
        LinkedList list = new LinkedList();
        for (int i = 0; i <10 ; i++) {
            list.add(rd.nextInt(70));
        }
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.get(-1));
        System.out.println(list.get(10));
        System.out.println(list.get(0));

    }
}
