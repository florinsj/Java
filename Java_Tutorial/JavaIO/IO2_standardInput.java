package JavaIO;

import java.io.IOException;

public class IO2_standardInput {
    // System.in -- standard input stream

    public static void main(String[] args) {
        int i = 0; // returns ASCII code of first character
        try {
            System.out.println("Enter a char: ");
            i = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println((char) i);

    }
}
