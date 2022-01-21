package Java_Tutorial.JavaSockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class JS1_server {

    public static void sendDataToClient(DataOutputStream out, String s) throws IOException {
        out.writeUTF(s);
        out.flush();
        System.out.println(s + " was sended to the client!");
    }

    public static String getDataFromClient(DataInputStream in) throws IOException {
        String s = in.readUTF();
        System.out.println(s + " was received from the client!");
        return s;
    }

    public static void main(String[] args) {
        DataInputStream in = null;
        DataOutputStream out = null;
        Socket socket = null;
        ServerSocket server = null;
        try {
            server = new ServerSocket(2003);
            System.out.println("..waiting for a client");
            socket = server.accept();
            System.out.println("connection with client established !");

        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
