package HackerRank30DaysOfCode;

import java.util.Scanner;

public class Day1DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int j;
        double dd;
        String s1;
        String s2;
        Scanner scanner = new Scanner(System.in);
        j = scanner.nextInt();
        dd = scanner.nextDouble();
        System.out.println();
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();

        System.out.println(i + j);
        System.out.println(d + dd);

        System.out.println(s + s2);
        scan.close();
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */

        scan.close();
    }
}
//test case
//        When we sum the integers 4 and 12, we get the integer 16 .
//        When we sum the floating-point numbers  4.0 and 4.0 , we get 8.0 .
//        When we concatenate HackerRank with is the best place
//        to learn and practice coding!, we get HackerRank is
//        the best place to learn and practice coding!.


