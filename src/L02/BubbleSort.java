package L02;

abstract class BubbleSort {

    //O(n^2)
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n  ;i++)
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1])
                    swap(a,j, j + 1);
            }
    }

    //O(n^2)
    public static void BBsort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n ; i++)
            for (int j = 0; j < n -1 ; j++) {
                if (a[j] > a[j + 1])
                    swap(a,j, j + 1);
            }
    }

    //O(1)
    private static void swap(int[] a,int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
