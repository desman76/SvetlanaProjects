package lesson32;

import java.util.Scanner;

public class My324Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class<? extends Exception>[] exceptions = new Class[]{
                Exceptions.ExceptionOne.class,
                Exceptions.ExceptionTwo.class,
                Exceptions.ExceptionThree.class,
                Exceptions.ExceptionFour.class,
                Exceptions.ExceptionFive.class,
                Exceptions.ExceptionSix.class,
                Exceptions.ExceptionSeven.class,
                Exceptions.ExceptionEight.class,
                Exceptions.ExceptionNine.class,
                Exceptions.ExceptionTen.class
        };
        System.out.println("Выберите номер исключения (1-10):");
        for (int i = 0; i < exceptions.length; i++) {
            System.out.println((i + 1) + ". " + exceptions[i].getSimpleName());
        }
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 10) {
            try {
                throw exceptions[choice - 1].getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                System.out.println("Выброшено: " + e.getMessage());
            }
        } else {
            System.out.println("Некорректный выбор. Пожалуйста, выберите номер от 1 до 10.");
        }

        scanner.close();
    }
}
