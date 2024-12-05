package lesson33;

import java.util.Scanner;

public class My332Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        try {
            int number = scanner.nextInt();
            System.out.println("Вы ввели число: " + number);
        } catch (Exception e) {
            System.out.println("Ввод некорректный.");
        }
    }
}
