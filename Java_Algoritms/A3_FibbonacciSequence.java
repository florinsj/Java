// Florin Stanciu
// Learning Java
// Fibonacci  sequence
package Java_Algoritms;

import java.util.Scanner;

public class A3_FibbonacciSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number up to which to calculate the number of Fibonacci:");
        int n = scan.nextInt();
        System.out.println("The number of Fibonacci is: " + fibo(n));
        System.out.print("The Fibonacci sequence is: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {

            return fibo(n - 2) + fibo(n - 1);
        }
    }
}
