package lesson33;

import java.util.Scanner;

public class My333Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите число: ");
            try {
                number = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Ввод некорректный. Пожалуйста, введите целое число.");
                scanner.next();
            }
        }
        System.out.println("Вы ввели число: " + number);
        scanner.close();
    }
}
