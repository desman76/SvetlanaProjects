package lesson13;

import java.util.Scanner;

public class My136Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);
    }
}


