package lesson4;

import java.util.Scanner;

public class My47Proekt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter true или false:");
        boolean booleanValue = scan.nextBoolean();
        int intValue = booleanValue ? 1 : 0;
        System.out.println("int: " + intValue);
    }
}
