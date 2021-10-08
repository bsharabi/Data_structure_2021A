package L02;

import java.util.Arrays;

class RemoveElementFromArray {
    public static void main(String[] args) {
        // define original array 
        int[] tensArray = {10, 20, 30, 40, 50, 60};

        // Print the original array 
        System.out.println("Original Array: " + Arrays.toString(tensArray));

        // the index at which the element in the array is to be removed 
        int rm_index = 2;

        // display index 
        System.out.println("Element to be removed at index: " + rm_index);

        // if array is empty or index is out of bounds, removal is not possible 
        if (tensArray == null || rm_index < 0 || rm_index >= tensArray.length) {
            System.out.println("No removal operation can be performed!!");
        } else {
            // Create a proxy array of size one less than original array
            int[] proxyArray = new int[tensArray.length - 1];

            // copy all the elements in the original to proxy array except the one at index
            for (int i = 0, k = 0; i < tensArray.length; i++) {

                // check if index is crossed, continue without copying
                if (i == rm_index) {
                    continue;
                }

                // else copy the element
                proxyArray[k++] = tensArray[i];
            }

            // Print the copied proxy array
            System.out.println("Array after removal operation: " + Arrays.toString(proxyArray));
        }
    }
}