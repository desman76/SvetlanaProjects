package lesson4;

import java.util.Scanner;

public class My48Proekt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter string:");
        String str = scan.nextLine();
        boolean booleanValue1 = Boolean.parseBoolean(str);
        System.out.println("boolean: " + booleanValue1);
          }
}
