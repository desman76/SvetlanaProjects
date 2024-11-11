package lesson18;

import java.util.Scanner;

public class My185Project {
    public static void main(String[] args) {
        String str1 = readString();
        String str2 = readString();
        String str3 = readString();
        String str4 = readString();
        String str5 = readString();
        String longMax = longString (str1, str2, str3, str4, str5);
        System.out.println("Самая длинная строка: " + longMax);
    }

    public static String readString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        return sc.nextLine();
    }

    public static String longString (String a, String b, String c, String d, String e) {
        if (a.length() >= b.length() && a.length() >= c.length() && a.length() >= d.length()&& a.length() >= e.length()) {
            return a;
        } else if (b.length() >= c.length()&& b.length() >= d.length()&& b.length() >= e.length()) {
            return b;
        } else if (c.length() >= d.length()&& c.length() >= e.length()) {
            return c;
        } else if (d.length() >= e.length()&&d.length() >= a.length()) {
            return d;
        } else {
            return e;
        }
    }
}
