package Java_Tutorial.JavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IO10_BufferedInputStream {
    // BufferedInputStream class is used to read information from stream
    // It internally uses buffer to make the performance fast


    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\test.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
