package lesson4;

import java.util.Scanner;

public class My412Proekt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter char:");
        int charCode = 30;
        char value = (char) charCode;
        while (charCode < 151) {
            System.out.println(charCode + " " + value);
            charCode = charCode + 1;
            value = (char) charCode;
        }
    }
}
