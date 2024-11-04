package Lesson3;

import java.util.Scanner;

public class My31Projekt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите строку:");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println(length);
    }
}
