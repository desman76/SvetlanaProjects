package lesson4;

import java.util.Scanner;

public class My410Proekt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter char:");
        char x = scan.next().charAt(0);
        int y = Integer.parseInt(String.valueOf(x));
        System.out.println("int value: " + y);
    }
}
