package Java_Tutorial.JavaIO;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO9_BufferedOutputStream {
    // BufferedOutputStream class is used for buffering an output stream.
    // It internally uses buffer to store data
    // ads more efficiency than to write directly into a stream

    // practically ads a buffer in an output stream


    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("E:\\test.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "Welcome to Bucharest!";
            byte b[] = s.getBytes();  // converting string s to byte array
            bout.write(b);// put b in bufferOutputStream and bufferOutputStream put b in fileOutputStream
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Success!");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
