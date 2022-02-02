package Java_Tutorial.Java3_Variables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// example of various types of variables
// square root calculation

public class Variables9readIntegers {
    public static void main(String[] args) {

        int number = 0;     // local variables
        BufferedReader in;  // local variables
        String line;        // local variables
        try {
            in = new BufferedReader(new InputStreamReader(System.in), 1);
            while (true) {
                System.out.print("Enter number " + Radix.numberOfNumbers + ": ");
                line = in.readLine();
                try {
                    number = Integer.parseInt(line);
                } catch (NumberFormatException f) {     // parameter variable e
                    System.out.println("The entered number is not an int !");
                }
                Radix obj = new Radix(number);
                System.out.println("Square root of " + number + " is " + obj.squareRoot());
                System.out.println("Continue? press any key --- Stop? press s");
                line = in.readLine();
                if (line.equals("s") || line.equals("S"))
                    break;
            }
            in.close();
        } catch (IOException e) {   // parameter variable  e
            System.err.println("Fail read from user!");
        }

    }
}

class Radix {
    static int numberOfNumbers = 1;   //static variable
    int num;                        // instance variable (member)

    //constructor with parameter variable
    Radix(int num) {
        this.num = num;
        numberOfNumbers++;
    }

    double squareRoot() {
        return Math.sqrt(num);
    }
}
