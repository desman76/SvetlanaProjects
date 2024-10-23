package lesson5;

import java.util.Scanner;

public class My54Proekt {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Please enter string 1: ");
        String str1 = scan1.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Please enter string 2: ");
        String str2 = scan2.nextLine();
        int x = str1.length();
        int y = str2.length();
        System.out.println(Math.abs(x-y));
    }
}
