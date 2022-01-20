package JavaIO;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class IO7_DataOutputStream {
    // DataOutputStream class allows an app to write primitive Java data type to
    // the output in a machine-independent way


    public static void main(String[] args) {

        try {
            OutputStream file = new FileOutputStream("E:\\test.txt");
            DataOutputStream dos = new DataOutputStream(file);

            dos.writeInt(65);  //write an int to output

            dos.flush();
            dos.close();
            System.out.println("succes");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
