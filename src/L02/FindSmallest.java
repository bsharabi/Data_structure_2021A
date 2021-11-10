package L02;

public class FindSmallest {


    public static int smallest(int[] arr)
    {

        int i;
        int min = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 324, 45, 90, 9808};
        System.out.println("Largest in given array is " + smallest(arr));
    }
}
