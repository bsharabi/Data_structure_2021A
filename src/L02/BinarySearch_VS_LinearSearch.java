package L02;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch_VS_LinearSearch {



    public static void main(String[] args) {
        int[] a = fill(1000000);
        int key = a[6735];

        long start_time = System.currentTimeMillis();
        Arrays.sort(a); //By default O(nlog(n))
        long end_time = System.currentTimeMillis();

        System.out.println("Arrays.sort: " + (end_time - start_time));
        start_time = System.currentTimeMillis();
        int res = BSearch_Iterative_int(a, key);
        end_time = System.currentTimeMillis();
        System.out.println("BSearch_Iterative_int: " + (end_time - start_time) + "\nResult: " + res);

    }
    public static int[] fill(int size) {
        Random rd = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = rd.nextInt(Integer.MAX_VALUE);
        }
        return a;
    }


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

    public static int BSearch_Iterative_int(int[] a, int key) {
        int left = 0, right = a.length - 1;
        int mid;
        while (right >= left) {
            mid = left + (right - left) / 2;
            if (a[mid] == key)
                return mid;
            else if (a[mid] > key)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}
