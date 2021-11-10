package L02;

import java.util.Arrays;

public class ActionArray {

    static int[] f(int[] a) {
        System.out.println(a);
        for (int i = 0, n = a.length; i < n; i++) {
            if (i % 2 == 0)
                a[i] = -1;
        }
        return a;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};


        System.out.println(Arrays.toString(a));
        int[] res_a = f(a);

        System.out.println(Arrays.toString(res_a));
        System.out.println(a);
        System.out.println(res_a);

        a = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(a));
        res_a = f(Arrays.copyOf(a, a.length));
        System.out.println(Arrays.toString(res_a));
        System.out.println(a);
        System.out.println(res_a);
    }
}
