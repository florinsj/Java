 // Florin Stanciu
// Learning Java
// Find Largest and secondLargest number from an array of ints
package Java_Algoritms;

import java.util.Arrays;

public class A5_LargestAndSecondLargest {
    public static void main(String[] args) {
        int[] a = {5, 4, 2, 1, 6, 7, 2, 1};
        int largest = a[0], secondLargest = a[1];
        for (int i = 0; i < a.length; i++) {

            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Largest item= " + largest);
        System.out.println("SecondLargest item= " + secondLargest);

    }
}
