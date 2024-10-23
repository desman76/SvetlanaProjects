package lesson4;

import java.util.Scanner;

public class My411Proekt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter x:");
        int x = scan.nextInt();
        char y = (char) x;
        System.out.print(y);
    }
}
