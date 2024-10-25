package lesson6;

import java.util.Scanner;

public class My61Projekt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дробное число:");
        double a = sc.nextDouble();
        if (a > Math.PI) {
            System.out.println("pimore");
        } else {
            System.out.println("число меньше ПИ");
        }
    }
}