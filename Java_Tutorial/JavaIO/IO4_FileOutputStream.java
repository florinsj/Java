package JavaIO;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class IO4_FileOutputStream {
    // FileOutputStream is an output stream used for writing data to a file
    // for primitive values into a file use FileOutputStream
    // for char-oriented data use FileWriter

    // example 2 : write string

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("E:\\test.txt");
            String s = "Learning Java IO";
            byte b[] = s.getBytes(); // converting string s to byte array
            System.out.println(s + " --> converted to bytes= " + b.toString());
            fout.write(b);
            fout.close();
            System.out.println("write to fille - succes!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
