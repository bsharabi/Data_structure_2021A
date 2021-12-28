package L07;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BST bts = new BST();
        Random rd = new Random();
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=rd.nextInt(67);
            bts.add(a[i]);
        }
        System.out.println(Arrays.toString(a));
        bts.inOrder();
    }
}
