package lesson9;

import java.util.Scanner;

public class My99Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[10];
        System.out.println("Введите 10 строк:");
        for (int i = 0; i < 10; i++) {
            lines[i] = scanner.nextLine();
        }
        System.out.print("Введите число max: ");
        int max = scanner.nextInt();
        for (String line : lines) {
            if (line.length() < max) {
                System.out.println(line);
            } else {
                System.err.println(line.substring(0, max));
            }
        }

        scanner.close();
    }
}

