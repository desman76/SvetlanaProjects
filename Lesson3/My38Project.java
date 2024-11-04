package Lesson3;

import java.util.Scanner;

public class My38Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        String substr = str.substring(0,5);
        System.out.println(substr);
    }
}
