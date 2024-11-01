package lesson11;

import java.io.*;
import java.util.Scanner;

public class My116Project {
    public static void main(String[] args) throws IOException {
        InputStream stream = new FileInputStream("файл4.txt");
        Scanner scan = new Scanner(stream);
        String str1 = scan.nextLine();
        InputStream stream2 = new FileInputStream("файл4.txt");
        Scanner scan2 = new Scanner(stream);
        String str2 = scan.nextLine();
        System.out.println(str2);
        Scanner scan3 = new Scanner(System.in);
        String str3 = scan3.nextLine();
        while (!str3.equals(str1)) {
            System.out.println("не угадал");
            str3 = scan3.nextLine();
        }
        System.out.println("Верно");
    }
}


