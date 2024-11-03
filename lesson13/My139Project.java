package lesson13;

import java.util.Scanner;

public class My139Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Введите цифру: ");
            number = sc.nextInt();

            if (number >= 0 && number <= 6) {
                System.out.println();
            } else if (number == 9) {
                System.out.println("Конец");
                break;
            } else if (number == 7 || number == 8) {
                System.out.println("Введите строку:");
                sc.nextLine();
                String input;
                while (true) {
                    input = sc.nextLine();
                    if (input.equalsIgnoreCase("стоп")) {
                        break;
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Пожалуйста, введите цифру от 0 до 9.");
            }
        }
        sc.close();
    }
}


