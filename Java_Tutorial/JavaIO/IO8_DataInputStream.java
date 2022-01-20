package JavaIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class IO8_DataInputStream {

    // DataInputStream  allow an application to read primitive data from input stream
    // in a machine-independent way
    public static void main(String[] args) {

        DataInputStream dis;
        int count;
        try {
            InputStream input = new FileInputStream("E:\\test.txt");
            dis = new DataInputStream(input);
            count = input.available();// get the number of bytes that can be read from input
            byte[] ary = new byte[count];
            dis.read(ary); //read  from dis stream and put in ary array
            for (byte b : ary) {
                System.out.print((char) b + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
