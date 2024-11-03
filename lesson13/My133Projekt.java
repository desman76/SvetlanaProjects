package lesson13;

import java.util.Scanner;

public class My133Projekt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = sc.nextLine();
        for (int i = 1; i < str.length(); i += 2) {
        System.out.print(str.charAt(i));
        }
    }
}



