package lesson5;

import java.util.Scanner;

public class My55Proekt {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Please enter string 1: ");
        String str1 = scan1.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Please enter string 2: ");
        String str2 = scan2.nextLine();
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Please enter string 3: ");
        String str3 = scan3.nextLine();
        int x = str1.length();
        int y = str2.length();
        int z = str3.length();
        int max = Math.max(x, Math.max(y, z));
        int min = Math.min(x, Math.min(y, z));
        System.out.print(Math.abs(max - min));
    }
}
