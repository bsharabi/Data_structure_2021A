package L02;

import java.util.Arrays;
import java.util.Random;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] a = fill(10);
        int[] b = fill(10);


        Arrays.sort(a); //By default O(nlog(n))
        Arrays.sort(b); //By default O(nlog(n))
        int[] mergeArray =merge(a,b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(mergeArray));
    }

    public static int[] fill(int size) {
        Random rd = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = rd.nextInt(20);
        }
        return a;
    }

    public static int[] merge(int[] arr1, int[] arr2){
        return merge(arr1, arr2, arr1.length,  arr2.length,new int[arr1.length+arr2.length]);
    }
    private static int[] merge(int[] arr1, int[] arr2, int n1, int n2, int[] arr3)

    {
        int i = 0, j = 0, k = 0;

        while (i<n1 && j <n2)
        {

            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        while (i < n1)
            arr3[k++] = arr1[i++];

        while (j < n2)
            arr3[k++] = arr2[j++];

        return arr3;
    }
}
