package JavaIO;

import java.io.FileInputStream;

public class IO6_FileInputStream {

    // FileInputStream class obtains input bytes from a file
    // it is used for reading byte-oriented data (streams of raw bytes)  such as image,audio,video,etc
    // for character stream data use FileReader class

    // example 2 - read all chars from a file

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\test.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

