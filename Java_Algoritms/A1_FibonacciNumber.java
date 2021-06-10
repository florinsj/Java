package Java_Algoritms;

import java.util.Scanner;

public class A1_FibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number up to wich to calculate the number of Fibbonaci::");
        int n = scan.nextInt();
        System.out.println("The number of Fibonacci is: " + fibo(n));
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
