package lesson32;

import java.util.Scanner;

public class My325Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class<? extends Exception>[][] exceptions = new Class[][]{
                {Exceptions2.ExceptionOne.class, Exceptions2.ExceptionTwo.class, Exceptions2.ExceptionThree.class},
                {Exceptions2.ExceptionFour.class, Exceptions2.ExceptionFive.class, Exceptions2.ExceptionSix.class},
                {Exceptions2.ExceptionSeven.class, Exceptions2.ExceptionEight.class, Exceptions2.ExceptionNine.class}
        };

        System.out.println("Выберите строку и столбец для выброса исключения (1-3):");
        for (int i = 0; i < exceptions.length; i++) {
            for (int j = 0; j < exceptions[i].length; j++) {
                System.out.print("[" + (i + 1) + "," + (j + 1) + "] ");
            }
            System.out.println();
        }

        System.out.print("Введите номер строки: ");
        int row = scanner.nextInt();
        System.out.print("Введите номер столбца: ");
        int col = scanner.nextInt();

        try {
            if (row >= 1 && row <= 3 && col >= 1 && col <= 3) {
                throw exceptions[row - 1][col - 1].getDeclaredConstructor().newInstance();
            } else {
                throw new Exceptions2.ExceptionTen();
            }
        } catch (Exception e) {
            System.out.println("Выброшено: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
