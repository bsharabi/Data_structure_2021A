package L02;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {


    public static void main(String[] args) {
        int[] a ;
        a=fill(20);
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] fill(int size) {
        Random rd = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = rd.nextInt(30);
        }
        return a;
    }

    public static void selectionSort(int[] a) {
        int key, index;
        for (int i = 0; i < a.length; i++) {
            key = a[i];
            index = i;
            for (int j = i + 1; j < a.length ; j++) {
                if (key > a[j]) {
                    key = a[j];
                    index = j;
                }
            }
            swap(a, i, index);
        }

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}


