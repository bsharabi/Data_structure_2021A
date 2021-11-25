package AssignmentSolution;

import java.util.Arrays;

public class Matala_1 {

    public int max(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > m)
                m = a[i];
        return m;
    }

    public int average(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum / a.length;
    }

    int max2(int[] a) {
        return a[a.length - 1];
    }

    public void SortSolution(int[] a) {

        for (int i = 0; i < a.length; i++)
            if (a[i] > a[i + 1])
                swap(a, i, i + 1);
        for (int i = a.length - 1; i >= 0; i--)
            if (a[i] < a[i - 1])
                swap(a, i, i - 1);
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void bubbleSort(int[] a) {
        int temp;
        for (int i = 1; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length - i; j++)
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    found = true;
                }
            if (!found)
                return;
        }
    }

    public boolean check2(int[] a, int[] b) {
        int minA = a[0];
        for (int i = 1; i < a.length; i++)
            minA = Math.min(minA, a[i]);
        for (int i = 1; i < b.length; i++)
            if (minA < b[i])
                return false;
        return true;
    }

    public int CountSolution(int[] a) {
        mergeSort(a);
        int bestNum = a[0];
        int bestCount = 1;
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1])
                count++;
            else
                count = 1;
            if (count > bestCount) {
                bestCount = count;
                bestNum = a[i];
            }
        }
        return bestNum;
    }

    public void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    //O(logn)
    private void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int middle = l + (r - l) / 2;
            mergeSort(arr, l, middle);
            mergeSort(arr, middle + 1, r);
            merge(arr, l, middle, r);
        }
    }

    //O(n)
    private void merge(int[] a, int l, int middle, int r) {
        int[] right = new int[r - middle];
        int[] left = new int[middle - l + 1];

        right = Arrays.copyOfRange(a, l, middle + 1);
        left = Arrays.copyOfRange(a, middle + 1, r + 1);
        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if (left[i] > right[j])
                a[k++] = right[j++];
            else
                a[k++] = left[i++];
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }
}