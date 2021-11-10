package L02;
import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = fill(10);
        int key = a[6];
        Arrays.sort(a); //By default O(nlog(n))


        System.out.println(Arrays.toString(a));
        int res = BSearch_Iterative_int(a, key);
        System.out.println("BSearch_Iterative_int: \nResult: " + res);

        boolean bool = BSearch_Iterative_bool(a, key);
        System.out.println("BSearch_Iterative_bool: nResult: " + bool);

    }

    public static int[] fill(int size) {
        Random rd = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = rd.nextInt(30);
        }
        return a;
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

    public static boolean BSearch_Iterative_bool(int[] a, int key) {
        int left = 0, right = a.length - 1;
        int mid;
        while (right != left) {
            mid = (left + right) / 2;
            if (key > a[mid])
                left = mid + 1;
            else
                right = mid;
        }
        return key == a[left];
    }


}




