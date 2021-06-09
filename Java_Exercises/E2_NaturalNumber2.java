// Florin Stanciu
// Learning Java

/* Write a method with float parameters.The method will return 1 if the sum of parameters
 is natural number (integer , no fractional), otherwise will return 0.Test values :
  4.67, 8.93, 10.00
  51.24, 33.10, 1.66
  9.00, 8.01, 21.21

  Scrie o functie care primeste 3 parametri de tip real. Functia va returna 1 daca suma
  celor trei parametri formeaza un numar natural (aka, valoare fixa, fara virgula) si 0 in rest.
  Testeaza aceasta functie cu urmatoarele valori de intrare:
  4.67, 8.93, 10.00
  51.24, 33.10, 1.66
  9.00, 8.01, 21.21 */

//solution2 - using int cast
package Java_Exercises;

import java.util.Scanner;

public class E2_NaturalNumber2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);


        System.out.println("Enter a: ");
        float a = myObj.nextFloat();

        System.out.println("Enter b: ");
        float b = myObj.nextFloat();

        System.out.println("Enter c: ");
        float c = myObj.nextFloat();

        float sum = a + b + c;
        System.out.println("Sum is: " + sum);
        System.out.println("int cast(sum): "+(int)sum);
        System.out.println(functionNumber(sum));
        System.out.println(functionNumberInt(sum));
    }

    public static String functionNumber(float sum) {

        if (sum == (int)sum) {

            return "Sum is a natural number!";
        } else {
            return "Sum is NOT a natural number!";
        }

    }

    public static int functionNumberInt(float sum) {

        if (sum == (int)sum) {

            return 1;
        } else {
            return 0;
        }

    }
}
