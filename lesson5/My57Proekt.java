package lesson5;

import java.util.Scanner;

public class My57Proekt {
    public static void main(String[] args) {
        System.out.print("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double y = sc.nextDouble();
        char operator2 = sc.next().charAt(0);
        double z = sc.nextDouble();
        System.out.println("=");
        double result=0;
        if (operator == '+') {
            result = x + y;
        }
        if (operator == '-') {
            result = x - y;
        }
        if (operator == '*') {
            result = x * y;
        }
        if (operator == '/') {
            result = x / y;
        }

        if (operator2 == '+') {
            System.out.println(result + z);
        }
        if (operator2 == '-') {
            System.out.println(result- z);
        }
        if (operator2 == '*') {
            System.out.println(result*z);
        }
        if (operator2 == '/') {
            System.out.println(result/ z);
        }
    }
    }
