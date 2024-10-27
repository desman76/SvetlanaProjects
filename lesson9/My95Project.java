package lesson9;

import java.io.*;
import java.util.Scanner;

public class My95Project {
public static void main(String[] args) throws IOException {
            InputStream stream = new FileInputStream("файл1.txt");
            Scanner scan = new Scanner(stream);
            String str1 = scan.nextLine();
            InputStream stream1 = new FileInputStream(str1);
            Scanner scan1 = new Scanner(stream1);
            String str2 = scan1.nextLine();
    DataInputStream str = new DataInputStream(System.in);
    String read = str.readLine();
    str.close();
    PrintWriter writer = new PrintWriter(str2);
    writer.println(read);
writer.close();
                  }
            }

