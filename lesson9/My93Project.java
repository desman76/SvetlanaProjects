package lesson9;

import java.io.*;

public class My93Project {
    public static void main(String[] args) throws IOException {
        DataInputStream str = new DataInputStream(System.in);
        String read = str.readLine();
        System.out.print(read);
        str.close();
    }
}
