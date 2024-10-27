package lesson9;

import java.util.Scanner;

public class My98Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 строк:");

            for (int i = 0; i < 10; i++) {
                String input = scanner.nextLine();
                if (input.contains("!")) {
                    System.err.println(input);
                }
            }
            scanner.close();
        }
    }

