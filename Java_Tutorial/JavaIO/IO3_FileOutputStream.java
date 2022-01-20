package JavaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO3_FileOutputStream {
    // FileOutputStream is an output stream used for writing data to a file
    // for primitive values into a file use FileOutputStream
    // for char-oriented data use FileWriter

    // example 1 : write byte

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream(("E:\\test.txt"));
            fout.write(65);
            fout.close();
            System.out.println("write to file - success!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
