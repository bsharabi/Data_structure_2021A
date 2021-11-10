package L02;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[10];
        a=fill(10);
        insertionSort(a);

    }


    public static void insertionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            if (a[i] > a[i + 1]) {
                int j = i+1;
                while (j != 0 && a[j-1] > a[j])
                    swap(a, j--, j);
            }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    //במקרה הגרוע כאשר המערך ממוין בסדר הפוך הסיבוכיות של המיון היא n^2
    // במקרה הטוב בו המערך כבר ממוין נקבל כי הסיבוכיות הי n
    public static void insertionSort2(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int[] fill(int size) {
        Random rd = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = rd.nextInt(Integer.MAX_VALUE);
        }
        return a;
    }
}
