package L02;

import java.util.Arrays;

public class UpdateElement {

    public static void main(String[] args) {
        // define original array
        int[] tensArray = {10, 20, 30, 40, 50, 60};



        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(tensArray));

        // the index at which the element in the array is to be removed
        int up_index = 3;

        // display index
        System.out.println("Element to be updated at index: " + up_index);

        // if array is empty or index is out of bounds, removal is not possible
        if (tensArray == null || up_index < 0 || up_index >= tensArray.length) {
            System.out.println("Unable to update !!");
        } else {
            tensArray[up_index] = 387;
            System.out.println("Array after " + Arrays.toString(tensArray));
        }
    }

}
