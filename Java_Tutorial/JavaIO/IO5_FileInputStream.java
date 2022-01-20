package JavaIO;

import java.io.FileInputStream;

public class IO5_FileInputStream {

    // FileInputStream class obtains input bytes from a file
    // it is used for reading byte-oriented data (streams of raw bytes)  such as image,audio,video,etc
    // for character stream data use FileReader class

    // example 1 - read single character

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\test.txt");
            int i = fin.read(); //read a byte of data from file
            System.out.println("Readed bytes from file: " + i);
            System.out.println("Readed bytes from file coverted to char: " + (char) i);
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

