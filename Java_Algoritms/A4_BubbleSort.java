// Florin Stanciu
// Learning Java
// Bubble sort
package Java_Algoritms;

import java.util.Arrays;

public class A4_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 53, 1, 6, 23, 52, 11, 5, 9, 14};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println("Sorting array..." + Arrays.toString(arr));
                }

            }
        }
        System.out.println("After bubble sort:" + Arrays.toString(arr));

    }
}
