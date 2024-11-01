package lesson11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class My119Project {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
         while (true) {
        String str1 = sc.nextLine();
         if (str1.contains(" ")) {
         break;
        }
        if (!str1.isEmpty()) {
        System.out.println(str1.charAt(0));
        }
        }
        sc.close();
        System.out.println("Конец");
    }
            }