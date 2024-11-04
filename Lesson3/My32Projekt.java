package Lesson3;

import java.util.Scanner;

public class My32Projekt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста введите строку1: ");
        String str = sc.nextLine();
        int a = str.length();
        System.out.println("Пожалуйста введите строку2");
        String str2 = sc.nextLine();
        int b = str.length();
        System.out.println(a+b);
           }
}
