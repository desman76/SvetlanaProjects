package Lesson3;

import java.util.Scanner;

public class My34Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        double a = sc.nextDouble();
        if (Math.sqrt(a) < 2) {
            System.out.println(a);
        }
        System.out.println("Введите дробное число2");
        double b = sc.nextDouble();
        if (Math.sqrt(b) < 2) {
            System.out.println(b);
        }
        System.out.println("Введите дробное число3");
        double c = sc.nextDouble();
        if (Math.sqrt(c) < 2) {
            System.out.println(c);
        }
    }
}

