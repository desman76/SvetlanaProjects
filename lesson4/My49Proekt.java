package lesson4;

import java.util.Scanner;

public class My49Proekt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter char:");
        char x=scan.next().charAt(0);
        String stringValue = Character.toString(x);
        System.out.println("String: " + stringValue);
    }
}


