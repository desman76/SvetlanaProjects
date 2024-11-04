package Lesson3;

import java.util.Scanner;

public class My311Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String str1 = sc.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = sc.nextLine();
        System.out.println("Введите третью строку:");
        String str3 = sc.nextLine();

        int minLength = Math.min(Math.min(str1.length(), str2.length()), str3.length());

        String result1 = str1.substring(0, Math.min(minLength, str1.length()));
        String result2 = str2.substring(0, Math.min(minLength, str2.length()));
        String result3 = str3.substring(0, Math.min(minLength, str3.length()));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
