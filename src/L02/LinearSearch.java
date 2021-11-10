package L02;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {

    public static int LinearSearch(int arr[], int x)
    {

        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }


    public static void main(String args[])
    {
        int[] a = fill(1000000);
        int key = a[6735];

        Arrays.sort(a); //By default O(nlog(n))

        // Function call
        int result = LinearSearch(a, key);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
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
