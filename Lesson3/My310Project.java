package Lesson3;

import java.util.Scanner;

public class My310Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();

        System.out.println("Введите третье число:");
        int num3 = sc.nextInt();

        boolean hasEven = (num1 % 2 == 0) || (num2 % 2 == 0) || (num3 % 2 == 0);
        boolean hasNegative = (num1 < 0) || (num2 < 0) || (num3 < 0);
        boolean hasGreaterThanThousand = (num1 > 1000) || (num2 > 1000) || (num3 > 1000);

        System.out.println("Есть четное число: " + hasEven);
        System.out.println("Есть отрицательное число: " + hasNegative);
        System.out.println("Есть число больше тысячи: " + hasGreaterThanThousand);


    }
}


