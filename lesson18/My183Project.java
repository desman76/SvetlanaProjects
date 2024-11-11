package lesson18;

import java.util.Scanner;

public class My183Project {
    public static void main(String[] args) {
        String str1 = readString();
        String str2 = readString();
        String str3 = readString();
        String longMax = longString (str1, str2, str3);
        System.out.println("Самая длинная строка: " + longMax);
    }

    public static String readString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        return sc.nextLine();
    }

    public static String longString (String a, String b, String c) {
        if (a.length() >= b.length() && a.length() >= c.length()) {
            return a;
        } else if (b.length() >= c.length()) {
            return b;
        } else {
            return c;
        }
    }
}


